package io.github.pabulaner.jxsd.out.model;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.out.OutParser;

public abstract class ModelParser<TClass extends JavaClass> extends OutParser<TClass> {

    public ModelParser() {
        this(false);
    }

    protected ModelParser(boolean isEnum) {
        super(isEnum, JavaName::toModel);
    }
}
