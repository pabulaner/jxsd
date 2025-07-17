package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class EnumConverterParser extends ConverterParser<JavaEnum> {

    public EnumConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaEnum clazz) {
        return builder;
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaEnum clazz) {
        return builder;
    }
}
