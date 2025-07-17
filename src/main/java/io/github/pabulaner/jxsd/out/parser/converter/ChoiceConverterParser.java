package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class ChoiceConverterParser extends ConverterParser<JavaChoice> {

    public ChoiceConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaChoice clazz) {
        clazz.inners().forEach(inner -> builder.addType(getGroup().parse(true, inner)));
        return super.parse(builder, clazz);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaChoice clazz) {
        TypeName modelType = ParserUtil.convertType(clazz.type(), getModelResolver());

        clazz.fields().forEach(field -> {
            JavaType fieldType = getModelResolver().resolve(field.type());
            String fieldName = getModelResolver().resolve(field.type(), field.name());
            TypeName converterType = ParserUtil.convertType(field.type(), getResolver(), false);

            String from = ParserUtil.convertMethodName(FROM, DOCX4J);
            String getter = ParserUtil.convertMethodName(GET, fieldName);
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
        return builder;
    }
}
