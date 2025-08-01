package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.parser.model.ModelParserGroup;
import io.github.pabulaner.jxsd.out.resolver.Resolver;
import io.github.pabulaner.jxsd.out.util.ParserUtil;

public abstract class BuilderParser<TClass extends JavaClass> extends BaseParser<TClass> {

    protected static final String BUILD = "build";

    protected static final String FROM = "from";

    protected BuilderParser(ParserGroup group) {
        super(group);
    }

    protected BuilderParser(ParserGroup group, ClassType classType) {
        super(group, classType);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, TClass clazz) {
        getGroup()
                .getMap()
                .getImplementations()
                .get(clazz.getType())
                .forEach(impl -> builder.addSuperinterface(ParserUtil.convertType(impl, getResolver())));

        return builder;
    }

    public Resolver getModelResolver() {
        return getGroup()
                .getMap()
                .getGroup(ModelParserGroup.NAME)
                .getResolver();
    }
}
