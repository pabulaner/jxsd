package io.github.pabulaner.jxsd.out.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.out.resolver.Name;

import javax.lang.model.element.Modifier;

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
