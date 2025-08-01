package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.java.JavaInterface;

import javax.lang.model.element.Modifier;

public class InterfaceBuilderParser extends BuilderParser<JavaInterface> {

    public InterfaceBuilderParser(ParserGroup group) {
        super(group, ClassType.INTERFACE);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaInterface clazz) {
        super.parse(builder, clazz);

        clazz.getMethods().forEach(method -> builder.addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(SET, method.getName()))
                .addModifiers(Modifier.PUBLIC, Modifier.ABSTRACT)
                .returns(ParserUtil.convertType(clazz.getType(), getResolver()))
                .addParameter(ParserUtil.convertType(clazz.getType(), getModelResolver()), VALUE)
                .build()));

        return builder;
    }
}
