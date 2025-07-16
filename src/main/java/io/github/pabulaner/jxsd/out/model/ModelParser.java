package io.github.pabulaner.jxsd.out.model;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.OutParser;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.List;

public abstract class ModelParser<TClass extends JavaClass> extends OutParser<TClass> {

    protected ModelParser() {
        this(ClassType.CLASS);
    }

    protected ModelParser(ClassType classType) {
        super(classType, new Resolver(List.of(), "model"));
    }
}
