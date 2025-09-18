package io.github.pabulaner.jxsd.gen.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.util.Name;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;

public class EnumConverterParser extends ConverterParser<JavaEnum> {

    public EnumConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaEnum clazz) {
        TypeName modelType = ParserUtil.convertType(clazz.getType(), getModelResolver());
        TypeName docx4jType = parseDocx4jType(clazz);

        clazz.getValues().forEach(value -> {
            value = new Name(value).toEnum();
            builder.addStatement("$N ($N == $T.$N) $N $T.$N", IF, VALUE, docx4jType, value, RETURN, modelType, value);
        });

        return builder.addStatement("$N $N", RETURN, NULL);
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaEnum clazz) {
        TypeName modelType = ParserUtil.convertType(clazz.getType(), getModelResolver());
        TypeName docx4jType = parseDocx4jType(clazz);

        clazz.getValues().forEach(value -> {
            value = new Name(value).toEnum();
            builder.addStatement("$N ($N == $T.$N) $N $T.$N", IF, VALUE, modelType, value, RETURN, docx4jType, value);
        });

        return builder.addStatement("$N $N", RETURN, NULL);
    }
}
