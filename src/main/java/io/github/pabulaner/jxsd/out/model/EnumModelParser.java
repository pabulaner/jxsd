package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.out.resolver.Name;

public class EnumModelParser extends ModelParser<JavaEnum> {

    public EnumModelParser() {
        super(ClassType.ENUM);
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
