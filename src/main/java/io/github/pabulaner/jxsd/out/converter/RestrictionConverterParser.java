package io.github.pabulaner.jxsd.out.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaRestriction;

public class RestrictionConverterParser extends ConverterParser<JavaRestriction> {

    @Override
    public MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaRestriction clazz) {
        return new PrimitiveConverterParser().parse(builder, clazz);
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaRestriction clazz) {
        return builder;
    }
}
