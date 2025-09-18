package io.github.pabulaner.jxsd.gen.parser.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.gen.parser.BaseParser;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;
import io.github.pabulaner.jxsd.gen.parser.model.ModelParserGroup;
import io.github.pabulaner.jxsd.gen.resolver.Resolver;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;

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
                .getTransformMap()
                .findImplementations(clazz.getType())
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
