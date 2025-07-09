package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.out.model.InterfaceModelParser;

public class InterfaceBuilderParser extends BuilderParser<JavaInterface> {

    public InterfaceBuilderParser() {
        super(ClassType.INTERFACE);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaInterface clazz) {
        return builder;
    }
}
