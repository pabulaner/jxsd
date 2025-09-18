package io.github.pabulaner.jxsd.gen.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaInterface;

import javax.lang.model.element.Modifier;

public class InterfaceModelParser extends ModelParser<JavaInterface> {

    public InterfaceModelParser(ParserGroup group) {
        super(group, ClassType.INTERFACE);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaInterface clazz) {
        super.parse(builder, clazz);

        clazz.getMethods().forEach(method -> builder.addMethod(MethodSpec.methodBuilder(ParserUtil.convertGetterName(method.getType(), method.getName()))
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .returns(ParserUtil.convertType(method.getType(), getResolver()))
                .build()));

        return builder;
    }
}
