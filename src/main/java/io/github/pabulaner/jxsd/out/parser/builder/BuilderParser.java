package io.github.pabulaner.jxsd.out.parser.builder;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.resolver.PkgResolver;

import java.util.List;

public abstract class BuilderParser<TClass extends JavaClass> extends BaseParser<TClass> {

    protected static final String BUILD = "build";

    protected static final String FROM = "from";

    private final PkgResolver modelResolver;

    public BuilderParser() {
        this(ClassType.CLASS);
    }

    protected BuilderParser(ClassType classType) {
        super(classType, new PkgResolver(List.of(), "builder"));
        modelResolver = new PkgResolver(List.of(), "model");
    }

    public PkgResolver getModelResolver() {
        return modelResolver;
    }
}
