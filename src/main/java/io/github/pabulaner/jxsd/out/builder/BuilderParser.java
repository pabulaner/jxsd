package io.github.pabulaner.jxsd.out.builder;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.out.OutParser;

public abstract class BuilderParser<TClass extends JavaClass> extends OutParser<TClass> {

    protected static final String BUILD = "build";

    protected static final String FROM = "from";

    public BuilderParser() {
        this(ClassType.CLASS);
    }

    protected BuilderParser(ClassType classType) {
        super(classType, JavaName::toBuilder);
    }
}
