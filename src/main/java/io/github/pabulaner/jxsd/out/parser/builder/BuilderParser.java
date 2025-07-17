package io.github.pabulaner.jxsd.out.parser.builder;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.parser.model.ModelParserGroup;
import io.github.pabulaner.jxsd.out.resolver.PkgResolver;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.List;

public abstract class BuilderParser<TClass extends JavaClass> extends BaseParser<TClass> {

    protected static final String BUILD = "build";

    protected static final String FROM = "from";

    protected BuilderParser(ParserGroup group) {
        super(group);
    }

    public Resolver getModelResolver() {
        return getGroup()
                .getMap()
                .getGroup(ModelParserGroup.NAME)
                .getResolver();
    }
}
