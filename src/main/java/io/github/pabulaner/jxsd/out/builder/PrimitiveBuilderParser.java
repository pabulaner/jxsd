package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaPrimitive;

import javax.lang.model.element.Modifier;

public class PrimitiveBuilderParser extends BuilderParser<JavaPrimitive> {

    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaPrimitive clazz) {
        ClassName builderType = parseType(clazz.type(), JavaName::toBuilder);
        ClassName modelType = parseType(clazz.type(), JavaName::toModel);
        ClassName primitiveType = parseType(clazz.primitive(), JavaName::name);

        return builder
                .addModifiers(Modifier.PUBLIC)
                .addField(primitiveType, VALUE, Modifier.PRIVATE)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
                        .build())
                .addMethod(MethodSpec.methodBuilder(FROM)
                        .addModifiers(Modifier.PUBLIC)
                        .returns(builderType)
                        .addParameter(modelType, VALUE)
                        .addStatement("$N.$N = $N.$N()", THIS, VALUE, VALUE, parseMethod(GET, VALUE))
                        .addStatement("$N $N", RETURN, THIS)
                        .build())
                .addMethod(MethodSpec.methodBuilder(BUILD)
                        .addModifiers(Modifier.PUBLIC)
                        .returns(modelType)
                        .addStatement("$N $N $T($N.$N)", RETURN, NEW, modelType, THIS, VALUE)
                        .build())
                .addMethod(MethodSpec.methodBuilder(parseMethod(SET, VALUE))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(builderType)
                        .addParameter(primitiveType, VALUE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .addStatement("return $N", THIS)
                        .build());
    }
}
