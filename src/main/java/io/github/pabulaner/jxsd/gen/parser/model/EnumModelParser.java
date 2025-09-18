package io.github.pabulaner.jxsd.gen.parser.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.util.Name;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;

public class EnumModelParser extends ModelParser<JavaEnum> {

    public EnumModelParser(ParserGroup group) {
        super(group, ClassType.ENUM);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaEnum clazz) {
        super.parse(builder, clazz);

        clazz.getValues()
                .stream()
                .map(value -> new Name(value).toEnum())
                .forEach(builder::addEnumConstant);

        return builder;
    }
}
