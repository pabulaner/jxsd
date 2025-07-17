package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class SequenceConverterParser extends ConverterParser<JavaSequence> {

    public SequenceConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        clazz.inners().forEach(inner -> builder.addType(getGroup().parse(true, inner)));
        return super.parse(builder, clazz);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaSequence clazz) {
        TypeName modelType = ParserUtil.convertType(clazz.type(), getModelResolver());
        boolean[] first = { true };

        builder.addCode("$N $N $T(", RETURN, NEW, modelType);

        clazz.fields().forEach(field -> {
            JavaType fieldType = getModelResolver().resolve(field.type());
            String fieldName = getModelResolver().resolve(field.type(), field.name());
            TypeName converterType = ParserUtil.convertType(field.type(), getResolver(), false);

            String from = ParserUtil.convertMethodName(FROM, DOCX4J);
            String getter = ParserUtil.convertMethodName(GET, fieldName);

            if (first[0]) {
                first[0] = false;
            } else {
                builder.addCode(", ");
            }

            if (fieldType.isList()) {
                builder.addCode("$N.$N().$N().$N($N -> $T.$N($N.$N())).$N($T.$N())", VALUE, getter, STREAM, MAP, VAL, converterType, from, VAL, getter, COLLECT, COLLECTORS_TYPE, TO_LIST);
            } else {
                builder.addCode("$T.$N($N.$N())", converterType, from, VALUE, getter);
            }
        });

        return builder.addStatement(")");
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaSequence clazz) {
        return builder;
    }
}
