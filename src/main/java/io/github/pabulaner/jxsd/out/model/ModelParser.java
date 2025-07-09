package io.github.pabulaner.jxsd.out.model;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.out.OutParser;

public abstract class ModelParser<TClass extends JavaClass> extends OutParser<TClass> {

    public ModelParser() {
        this(ClassType.CLASS);
    }

    protected ModelParser(ClassType classType) {
        super(classType, JavaName::toModel);
    }
}
