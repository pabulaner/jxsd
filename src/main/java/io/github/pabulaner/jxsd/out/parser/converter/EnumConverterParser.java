package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.out.util.Name;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class EnumConverterParser extends ConverterParser<JavaEnum> {

    public EnumConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaEnum clazz) {
        TypeName modelType = ParserUtil.convertType(clazz.type(), getModelResolver());
        TypeName docx4jType = parseDocx4jType(clazz);

        clazz.values().forEach(value -> {
            value = new Name(value).toEnum();
            builder.addStatement("$N ($N == $T.$N) $N $T.$N", IF, VALUE, docx4jType, value, RETURN, modelType, value);
        });

        return builder.addStatement("$N $N", RETURN, NULL);
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaEnum clazz) {
        return builder;
    }
}
