package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaEnum;
import io.github.pabulaner.jxsd.java.JavaName;

import javax.lang.model.element.Modifier;

public class EnumBuilderParser extends BuilderParser<JavaEnum> {

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaEnum clazz) {
        ClassName builderType = parseType(clazz.type(), JavaName::toBuilder);
        ClassName modelType = parseType(clazz.type(), JavaName::toModel);

        return builder
                .addModifiers(Modifier.PUBLIC)
                .addField(modelType, VALUE, Modifier.PRIVATE)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
                        .build())
                .addMethod(MethodSpec.methodBuilder(FROM)
                        .addModifiers(Modifier.PUBLIC)
                        .returns(builderType)
                        .addParameter(modelType, VALUE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .addStatement("$N $N", RETURN, THIS)
                        .build())
                .addMethod(MethodSpec.methodBuilder(BUILD)
                        .addModifiers(Modifier.PUBLIC)
                        .returns(modelType)
                        .addStatement("$N $N.$N", RETURN, THIS, VALUE)
                        .build())
                .addMethod(MethodSpec.methodBuilder(parseMethod(SET, VALUE))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(builderType)
                        .addParameter(modelType, VALUE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .addStatement("return $N", THIS)
                        .build());
    }
}
