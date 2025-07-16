package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaEnum;

public class EnumModelParser extends ModelParser<JavaEnum> {

    public EnumModelParser() {
        super(ClassType.ENUM);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaEnum clazz) {
        clazz.values().forEach(builder::addEnumConstant);
        return builder;
    }
}
