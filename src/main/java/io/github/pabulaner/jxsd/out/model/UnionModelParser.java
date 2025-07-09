package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaUnion;

import javax.lang.model.element.Modifier;

public class UnionModelParser extends ModelParser<JavaUnion> {

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaUnion clazz) {
        builder.addField(Object.class, VALUE, Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
                        .build());

        clazz.getTypes().forEach(type -> {
            TypeName valueType = parseType(type, JavaName::toModel);
            String valueName = type.getName().toUpper();

            builder.addMethod(MethodSpec.constructorBuilder()
                            .addModifiers(Modifier.PUBLIC)
                            .addParameter(valueType, VALUE)
                            .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                            .build())
                    .addMethod(MethodSpec.methodBuilder(parseMethod(IS, valueName))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(TypeName.BOOLEAN)
                            .addStatement("$N $N.$N $N $T", RETURN, THIS, VALUE, INSTANCEOF, valueType)
                            .build())
                    .addMethod(MethodSpec.methodBuilder(parseMethod(GET, valueName))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(valueType)
                            .addStatement("$N ($T) $N.$N", RETURN, valueType, THIS, VALUE)
                            .build());
        });

        return builder;
    }
}
