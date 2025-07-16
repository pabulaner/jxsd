package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaPrimitive;

import javax.lang.model.element.Modifier;

public class PrimitiveBuilderParser extends BuilderParser<JavaPrimitive> {

    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaPrimitive clazz) {
        TypeName builderType = parseType(clazz.type(), getResolver());
        TypeName modelType = parseType(clazz.type(), getModelResolver());
        TypeName primitiveType = parsePrimitive(clazz.type());

        return builder
                .addModifiers(Modifier.PUBLIC)
                .addField(primitiveType, VALUE, Modifier.PRIVATE)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
                        .build())
                .addMethod(MethodSpec.methodBuilder(parseMethod(SET, VALUE))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(builderType)
                        .addParameter(primitiveType, VALUE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .addStatement("return $N", THIS)
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
                        .build());
    }
}
