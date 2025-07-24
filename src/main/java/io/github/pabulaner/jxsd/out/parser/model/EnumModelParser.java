package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.out.util.Name;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class EnumModelParser extends BaseParser<JavaEnum> {

    public EnumModelParser(ParserGroup group) {
        super(group, ClassType.ENUM);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaEnum clazz) {
        clazz.values()
                .stream()
                .map(value -> new Name(value).toEnum())
                .forEach(builder::addEnumConstant);

        return builder;
    }
}
