package io.github.pabulaner.jxsd.out.builder;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.OutParser;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.List;

public abstract class BuilderParser<TClass extends JavaClass> extends OutParser<TClass> {

    protected static final String BUILD = "build";

    protected static final String FROM = "from";

    private final Resolver modelResolver;

    public BuilderParser() {
        this(ClassType.CLASS);
    }

    protected BuilderParser(ClassType classType) {
        super(classType, new Resolver(List.of(), "builder"));
        modelResolver = new Resolver(List.of(), "model");
    }

    public Resolver getModelResolver() {
        return modelResolver;
    }
}
