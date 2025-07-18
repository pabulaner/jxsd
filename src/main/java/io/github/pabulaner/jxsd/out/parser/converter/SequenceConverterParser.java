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
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class SequenceConverterParser extends ConverterParser<JavaSequence> {

    private JavaClass outer;
    
    public SequenceConverterParser(ParserGroup group) {
        super(group);
        outer = null;
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        clazz.inners().forEach(inner -> {
            if (!(inner instanceof JavaChoice)) {
                builder.addType(getGroup().parse(true, inner));
            }
        });
        return super.parse(builder, clazz);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaSequence clazz) {
        TypeName modelType = ParserUtil.convertType(clazz.type(), getModelResolver());
        boolean[] first = { true };
        
        CodeBlock.Builder innerBlock = CodeBlock.builder();
        CodeBlock.Builder newBlock = CodeBlock.builder()
                .add("$N $N $T(", RETURN, NEW, modelType);
        
        clazz.fields().forEach(field -> {
            JavaType fieldType = getModelResolver().resolve(field.type());
            TypeName convertedFieldType = ParserUtil.convertType(field.type(), getModelResolver());
            String fieldName = getModelResolver().resolve(field.type(), field.name());
            TypeName converterType = ParserUtil.convertType(field.type(), getResolver(), false);

            String from = ParserUtil.convertMethodName(FROM, DOCX4J);
            String getter = ParserUtil.convertMethodName(GET, fieldName);

            JavaChoice choice = getInnerChoice(clazz, field);

            if (choice != null) {
                TypeName choiceType = ParserUtil.convertType(choice.type(), getModelResolver());

                innerBlock.addStatement("// look here " + field.type().isList());
                innerBlock.addStatement("$T $N = $N $T()", choiceType, fieldName, NEW, choiceType);

                choice.fields().forEach(choiceField -> {
                    String choiceFieldName = getModelResolver().resolve(choiceField.type(), choiceField.name());
                    TypeName choiceConverterType = ParserUtil.convertType(choiceField.type(), getResolver(), false);

                    String choiceGetter = ParserUtil.convertMethodName(GET, choiceFieldName);
                    String choiceNewModel = ParserUtil.convertMethodName(NEW, choiceFieldName);

                    innerBlock.addStatement("$N ($N.$N() != $N) $N = $T.$N($T.$N($N.$N()))", IF, VALUE, choiceGetter, NULL, fieldName, convertedFieldType, choiceNewModel, choiceConverterType, from, VALUE, choiceGetter);
                });
            }

            if (first[0]) {
                first[0] = false;
            } else {
                newBlock.add(", ");
            }

            if (choice != null) {
                newBlock.add("$N", fieldName);
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
    
    private JavaChoice getInnerChoice(JavaSequence clazz, JavaField field) {
        for (JavaClass inner : clazz.inners()) {
            if (inner instanceof JavaChoice casted && inner.type().equals(field.type())) {
                return casted;
            }
        }
        
        return null;
    }
}
