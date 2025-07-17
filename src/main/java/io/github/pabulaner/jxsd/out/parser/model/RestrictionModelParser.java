package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.out.Util;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class RestrictionModelParser extends ModelParser<JavaRestriction> {

    public RestrictionModelParser(ParserGroup group) {
        super(group);
    }

    @Override
    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaRestriction clazz) {
        return builder
                .superclass(Util.convertType(clazz.parent(), getResolver()))
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(Util.convertPrimitive(clazz.primitive()), VALUE)
                        .addStatement("$N($N)", SUPER, VALUE)
                        .build());
    }
}
