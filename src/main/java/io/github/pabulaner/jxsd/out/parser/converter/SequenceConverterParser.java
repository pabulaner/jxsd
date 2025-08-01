package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.CodeBlock;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaField;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.util.Name;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SequenceConverterParser extends ConverterParser<JavaSequence> {

    private JavaClass outer;
    
    public SequenceConverterParser(ParserGroup group) {
        super(group);
        outer = null;
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        clazz.getInners().forEach(inner -> {
            if (!(inner instanceof JavaChoice)) {
                builder.addType(getGroup().parse(true, inner));
            }
        });
        return super.parse(builder, clazz);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaSequence clazz) {
        TypeName modelType = ParserUtil.convertType(clazz.getType(), getModelResolver());
        boolean[] first = { true };
        
        CodeBlock.Builder innerBlock = CodeBlock.builder();
        CodeBlock.Builder newBlock = CodeBlock.builder()
                .add("$N $N $T(", RETURN, NEW, modelType);
        
        clazz.getFields().forEach(field -> {
            JavaType fieldType = getModelResolver().resolve(field.getType());
            TypeName convertedFieldType = ParserUtil.convertType(field.getType(), getModelResolver(), false);
            Name fieldName = new Name(getModelResolver().resolve(field.getType(), field.getName()));
            TypeName converterType = ParserUtil.convertType(field.getType(), getResolver(), false);

            String from = ParserUtil.convertMethodName(FROM, DOCX4J);
            String getter = ParserUtil.convertGetterName(field.getType(), fieldName.name());

            JavaChoice choice = getInnerChoice(clazz, field);

            if (choice != null) {
                TypeName choiceType = ParserUtil.convertType(choice.getType(), getModelResolver(), fieldType.isList());
                innerBlock.add("$T $N = ", choiceType, fieldName.toVarLower());

                if (fieldType.isList()) {
                    boolean areTypesUnique = areTypesUnique(choice.getFields());
                    innerBlock.beginControlFlow("$N.$N().$N().$N($N ->", VALUE, getter, STREAM, MAP, VAL);

                    choice.getFields().forEach(choiceField -> {
                        TypeName choiceFieldType = ParserUtil.convertType(choiceField.getType(), getDocx4jResolver());
                        TypeName choiceConverterType = ParserUtil.convertType(choiceField.getType(), getResolver(), false);
                        String newModel = ParserUtil.convertMethodName(NEW, choiceField.getName());

                        if (areTypesUnique) {
                            innerBlock.addStatement("$N ($N $N $T) $N $T.$N($T.$N(($T) $N))", IF, VAL, INSTANCEOF, choiceFieldType, RETURN, convertedFieldType, newModel, choiceConverterType, from, choiceFieldType, VAL);
                        }
                    });

                    choiceType = ParserUtil.convertType(choice.getType(), getModelResolver(), false);

                    innerBlock.addStatement("$N $N $T()", RETURN, NEW, choiceType);
                    innerBlock.endControlFlow(").$N($T.$N())", COLLECT, COLLECTORS_TYPE, TO_LIST);
                } else {
                    innerBlock.addStatement("$N $T()", NEW, choiceType);

                    choice.getFields().forEach(choiceField -> {
                        String choiceFieldName = getModelResolver().resolve(choiceField.getType(), choiceField.getName());
                        TypeName choiceConverterType = ParserUtil.convertType(choiceField.getType(), getResolver(), false);

                        String choiceGetter = ParserUtil.convertGetterName(field.getType(), choiceFieldName);
                        String choiceNewModel = ParserUtil.convertMethodName(NEW, choiceFieldName);

                        innerBlock.addStatement("$N ($N.$N() != $N) $N = $T.$N($T.$N($N.$N()))", IF, VALUE, choiceGetter, NULL, fieldName.toVarLower(), convertedFieldType, choiceNewModel, choiceConverterType, from, VALUE, choiceGetter);
                    });
                }
            }

            if (first[0]) {
                first[0] = false;
            } else {
                newBlock.add(", ");
            }

            if (choice != null) {
                newBlock.add("$N", fieldName.toVarLower());
            } else if (fieldType.isList()) {
                newBlock.add("$N.$N().$N().$N($T::$N).$N($T.$N())", VALUE, getter, STREAM, MAP, converterType, from, COLLECT, COLLECTORS_TYPE, TO_LIST);
            } else {
                newBlock.add("$T.$N($N.$N())", converterType, from, VALUE, getter);
            }
        });

        newBlock.addStatement(")");

        return builder.addCode(innerBlock.build())
                .addCode(newBlock.build());
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaSequence clazz) {
        return builder;
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
    
    private JavaChoice getInnerChoice(JavaSequence clazz, JavaField field) {
        for (JavaClass inner : clazz.getInners()) {
            if (inner instanceof JavaChoice casted && inner.getType().equals(field.getType())) {
                return casted;
            }
        }
        
        return null;
    }
}
