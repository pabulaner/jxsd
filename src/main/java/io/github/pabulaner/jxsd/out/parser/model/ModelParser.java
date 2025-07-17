package io.github.pabulaner.jxsd.out.parser.model;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public abstract class ModelParser<TClass extends JavaClass> extends BaseParser<TClass> {

    protected ModelParser(ParserGroup group) {
        this(group, ClassType.CLASS);
    }

    protected ModelParser(ParserGroup group, ClassType classType) {
        super(group, classType);
    }
}
