package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaInterface;

public class InterfaceBuilderParser extends BuilderParser<JavaInterface> {

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaInterface clazz) {
        return builder;
    }
}
