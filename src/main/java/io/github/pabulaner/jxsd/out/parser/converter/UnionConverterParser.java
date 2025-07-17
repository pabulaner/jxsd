package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import io.github.pabulaner.jxsd.java.JavaUnion;

public class UnionConverterParser extends ConverterParser<JavaUnion> {

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaUnion clazz) {
        return builder;
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaUnion clazz) {
        return builder;
    }
}
