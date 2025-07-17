package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;

public class ChoiceConverterParser extends ConverterParser<JavaChoice> {

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaChoice clazz) {
        return builder;
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaChoice clazz) {
        return builder;
    }
}
