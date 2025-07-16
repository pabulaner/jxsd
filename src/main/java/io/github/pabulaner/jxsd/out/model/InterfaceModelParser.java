package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.java.JavaName;

import javax.lang.model.element.Modifier;

public class InterfaceModelParser extends ModelParser<JavaInterface> {

    public InterfaceModelParser() {
        super(ClassType.INTERFACE);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaInterface clazz) {
        clazz.getMethods().forEach(method -> builder.addMethod(MethodSpec.methodBuilder(GET + method.name().toUpper())
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .returns(parseType(method.type(), JavaName::toModel, method.isWildcard()))
                .build()));

        return builder;
    }
}
