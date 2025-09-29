package io.github.pabulaner.jxsd.spec.parser.converter;

import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.spec.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaField;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecKey;
import io.github.pabulaner.jxsd.spec.parser.ComplexSpecParser;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.util.Name;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SequenceConverterParser extends ComplexSpecParser {

    @Override
    public void parse(SpecContext ctx) {
        JavaSequence spec = ctx.get(SpecKey.SPEC);
        MethodSpec.Builder fromBuilder = ctx.get(ConverterParser.FROM_BUILDER);
        MethodSpec.Builder toBuilder = ctx.get(ConverterParser.TO_BUILDER);
        Resolver modelResolver = ctx.get(SpecKey.MODEL_RESOLVER);
        Resolver converterResolver = ctx.get(SpecKey.CONVERTER_RESOLVER);
        Resolver docx4jResolver = ctx.get(SpecKey.DOCX4J_RESOLVER);

        // parse all inners except for choices
        spec.getInners().forEach(inner -> {
            if (!(inner instanceof JavaChoice)) {
                parseInner(ctx, inner);
            }
        });

        JavaType specType = spec.getType();
        TypeName modelTypeName = ParserUtil.convertType(specType, modelResolver);
        TypeName converterTypeName = ParserUtil.convertType(specType, converterResolver);
        TypeName docx4jTypeName = ParserUtil.convertType(specType, docx4jResolver);

        CodeBlock.Builder fromInnerBuilder = CodeBlock.builder();
        CodeBlock.Builder fromNewBuilder = CodeBlock.builder().add("return new $T(", modelTypeName);

        CodeBlock.Builder toInnerBuilder = CodeBlock.builder();
        toBuilder.addStatement("$T result = new $T()", docx4jTypeName, docx4jTypeName);

        boolean[] first = { true };

        spec.getFields().forEach(field -> {
            JavaType fieldType = field.getType();
            TypeName fieldConverterTypeName = ParserUtil.convertType(fieldType, converterResolver, false);
            TypeName docx4jFieldTypeName = ParserUtil.convertType(fieldType, docx4jResolver, false);
            Name fieldName = new Name(modelResolver.resolve(specType, field.getName()));
            String fieldNameLower = fieldName.toVarLower();
            String fieldNameUpper = fieldName.toVarUpper();

            JavaChoice choice = getInnerChoice(spec, field);
            boolean isList = fieldType.isList();

            if (first[0]) {
                first[0] = false;
            } else {
                fromNewBuilder.add(", ");
            }

            if (choice != null) {
                JavaType choiceType = choice.getType();
                TypeName choiceTypeName = ParserUtil.convertType(choiceType, modelResolver, isList);
                String choiceName = new Name(choiceType.getName()).toVarUpper();

                fromInnerBuilder.add("$T $N = ", choiceTypeName, fieldNameLower);

                if (isList) {
                    boolean areTypesUnique = areTypesUnique(choice.getFields());
                    String stream = "value.get$N().stream().map(val ->";

                    // TODO: compare to previous
                    fromInnerBuilder.beginControlFlow(stream, fieldNameUpper);
                    toInnerBuilder.add("result.get$N().addAll(", fieldNameUpper).beginControlFlow(stream, fieldNameUpper);

                    choice.getFields().forEach(choiceField -> {
                        JavaType choiceFieldType = choiceField.getType();
                        TypeName choiceFieldTypeName = ParserUtil.convertType(choiceFieldType, docx4jResolver);
                        TypeName choiceConverterTypeName = ParserUtil.convertType(choiceFieldType, converterResolver, false);
                        String choiceFieldName = new Name(choiceField.getName()).toUpper();

                        if (areTypesUnique) {
                            fromInnerBuilder.addStatement("if (val instanceof $T) return $T.new$N($T.fromDocx4j(($T) val))", choiceFieldTypeName, docx4jFieldTypeName, choiceFieldName, choiceConverterTypeName, choiceFieldTypeName);
                            toInnerBuilder.addStatement("if (val.is$N()) return $T.toDocx4j(val.get$N())", choiceFieldName, converterTypeName, choiceFieldName);
                        } else {
                            // TODO: implement
                        }
                    });

                    toInnerBuilder.addStatement("return null").endControlFlow(").collect($T.toList())", Collectors.class);
                } else {
                    fromInnerBuilder.addStatement("new $T()", choiceTypeName);

                    choice.getFields().forEach(choiceField -> {
                        JavaType choiceFieldType = choiceField.getType();
                        TypeName choiceFieldTypeName = ParserUtil.convertType(choiceFieldType, docx4jResolver);
                        TypeName choiceConverterTypeName = ParserUtil.convertType(choiceFieldType, converterResolver, false);
                        String choiceFieldName = new Name(choiceField.getName()).toUpper();

                        fromInnerBuilder.addStatement("if (value.get$N() != null) $N = $T.new$N($T.fromDocx4j(value.get$N()))", choiceFieldName, fieldNameLower, converterTypeName, fieldNameUpper, converterTypeName, choiceFieldName);
                        toInnerBuilder.addStatement("if (value.get$N().is$N()) result.set$N($T.toDocx4j(value.get$N().get$N()))", choiceName, choiceFieldName, choiceFieldName, choiceConverterTypeName, choiceName, choiceFieldName);
                    });
                }

                fromNewBuilder.add(fieldNameLower);
            } else if (isList) {
                fromNewBuilder.add("value.get$N().stream().map($T::fromDocx4j).collect($T.toList())", fieldNameUpper, fieldConverterTypeName, Collectors.class);
                toBuilder.addStatement("result.get$N().addAll(value.get$N().stream().map($T::toDocx4j).collect($T.toList()))", fieldNameUpper, fieldNameUpper, fieldConverterTypeName, Collectors.class);
            } else {
                fromNewBuilder.add("$T.fromDocx4j(value.get$N())", fieldConverterTypeName, fieldNameUpper);
                toBuilder.addStatement("result.set$N($T.toDocx4j(value.get$N()))", fieldNameUpper, fieldConverterTypeName, fieldNameUpper);
            }
        });

        fromNewBuilder.addStatement(")");
        fromBuilder.addCode(fromInnerBuilder.build()).addCode(fromNewBuilder.build());
        toBuilder.addCode(toInnerBuilder.build()).addStatement("return result");

        ctx.next();
    }

    private JavaChoice getInnerChoice(JavaSequence spec, JavaField field) {
        for (JavaClass inner : spec.getInners()) {
            if (inner instanceof JavaChoice casted && inner.getType().equals(field.getType())) {
                return casted;
            }
        }

        return null;
    }

    private boolean areTypesUnique(List<JavaField> fields) {
        Set<JavaType> types = new HashSet<>();

        for (JavaField field : fields) {
            JavaType type = field.getType();

            if (types.contains(type)) {
                return false;
            }

            types.add(type);
        }

        return true;
    }
}
