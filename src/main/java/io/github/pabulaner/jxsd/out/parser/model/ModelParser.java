package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.util.ParserUtil;

public abstract class ModelParser<TClass extends JavaClass> extends BaseParser<TClass> {
    protected ModelParser(ParserGroup group) {
        super(group);
    }

    protected ModelParser(ParserGroup group, ClassType classType) {
        super(group, classType);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, TClass clazz) {
        System.out.println(clazz.getType().getName());
        getGroup()
                .getMap()
                .getImplementations()
                .get(clazz.getType())
                .forEach(impl -> builder.addSuperinterface(ParserUtil.convertType(impl, getResolver())));

        return builder;
    }
}
