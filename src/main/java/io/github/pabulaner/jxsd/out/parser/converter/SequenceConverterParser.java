package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import io.github.pabulaner.jxsd.java.JavaSequence;

public class SequenceConverterParser extends ConverterParser<JavaSequence> {


    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaSequence clazz) {
        return builder;
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaSequence clazz) {
        return builder;
    }
}
