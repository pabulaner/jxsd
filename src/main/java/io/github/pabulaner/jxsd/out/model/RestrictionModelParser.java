package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaRestriction;

import javax.lang.model.element.Modifier;

public class RestrictionModelParser extends ModelParser<JavaRestriction> {

    @Override
    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaRestriction clazz) {
        return builder
                .superclass(parseType(clazz.parent(), JavaName::toModel))
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(parseType(clazz.primitive(), JavaName::name), VALUE)
                        .addStatement("$N($N)", SUPER, VALUE)
                        .build());
    }
}
