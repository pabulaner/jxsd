package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaInterface;

public class InterfaceModelParser extends ModelParser<JavaInterface> {

    public InterfaceModelParser() {
        super(ClassType.INTERFACE);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaInterface clazz) {
        return builder;
    }
}
