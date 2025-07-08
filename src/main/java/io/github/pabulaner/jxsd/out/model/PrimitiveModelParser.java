package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaPrimitive;

import javax.lang.model.element.Modifier;

public class PrimitiveModelParser extends ModelParser<JavaPrimitive> {

    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaPrimitive clazz) {
        ClassName primitiveType = parseType(clazz.getPrimitive(), JavaName::getName);

        return builder
                .addModifiers(Modifier.PUBLIC)
                .addField(primitiveType, VALUE, Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(primitiveType, VALUE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .build())
                .addMethod(MethodSpec.methodBuilder(parseMethod(GET, VALUE))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(primitiveType)
                        .addStatement("$N $N.$N", RETURN, THIS, VALUE)
                        .build());
    }
}
