package io.github.pabulaner.jxsd.gen.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;

public class ChoiceConverterParser extends ConverterParser<JavaChoice> {

    public ChoiceConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaChoice clazz) {
        clazz.getInners().forEach(inner -> builder.addType(getGroup().parse(true, inner)));
        return super.parse(builder, clazz);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaChoice clazz) {
        TypeName modelType = ParserUtil.convertType(clazz.getType(), getModelResolver());

        clazz.getFields().forEach(field -> {
            JavaType fieldType = getModelResolver().resolve(field.getType());
            String fieldName = getDocx4jResolver().resolve(clazz.getType(), field.getName());
            TypeName converterType = ParserUtil.convertType(field.getType(), getResolver(), false);

            String from = ParserUtil.convertMethodName(FROM, DOCX4J);
            String getter = ParserUtil.convertGetterName(field.getType(), fieldName);
            String newModel = ParserUtil.convertMethodName(NEW, fieldName);

            if (fieldType.isList()) {
                throw new UnsupportedOperationException("Not implemented");
            } else {
                builder.addStatement("$N ($N.$N() != $N) $N $T.$N($T.$N($N.$N()))", IF, VALUE, getter, NULL, RETURN, modelType, newModel, converterType, from, VALUE, getter);
            }
        });

        return builder.addStatement("$N $N $T()", RETURN, NEW, modelType);
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaChoice clazz) {
        TypeName docx4jType = ParserUtil.convertType(clazz.getType(), getDocx4jResolver());
        builder.addStatement("$T $N = $N $T()", docx4jType, RESULT, NEW, docx4jType);

        clazz.getFields().forEach(field -> {
            JavaType fieldType = getModelResolver().resolve(field.getType());
            String fieldName = getDocx4jResolver().resolve(clazz.getType(), field.getName());
            TypeName converterType = ParserUtil.convertType(field.getType(), getResolver(), false);

            String to = ParserUtil.convertMethodName(TO, DOCX4J);
            String is = ParserUtil.convertMethodName(IS, fieldName);
            String getter = ParserUtil.convertMethodName(GET, fieldName);
            String setter = ParserUtil.convertMethodName(SET, fieldName);

            if (fieldType.isList()) {
                throw new UnsupportedOperationException("Not implemented");
            } else {
                builder.addStatement("$N ($N.$N()) $N.$N($T.$N($N.$N()))", IF, VALUE, is, RESULT, setter, converterType, to, VALUE, getter);
            }
        });

        builder.addStatement("$N $N", RETURN, RESULT);
        return builder;
    }
}
