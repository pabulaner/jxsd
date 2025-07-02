package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaUnion;

import javax.lang.model.element.Modifier;

public class UnionBuilderParser extends BuilderParser<JavaUnion> {

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaUnion clazz) {
        ClassName builderType = parseType(clazz.type(), JavaName::toBuilder);
        ClassName modelType = parseType(clazz.type(), JavaName::toModel);

        MethodSpec.Builder build = MethodSpec.methodBuilder(BUILD)
                .addModifiers(Modifier.PUBLIC)
                .returns(modelType);

        builder.addField(Object.class, VALUE, Modifier.PRIVATE)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
                        .build());

        clazz.types().forEach(type -> {
            ClassName valueModelType = parseType(type, JavaName::toModel);
            String valueName = type.name().toUpper();

            build.addStatement("$N ($N.$N $N $T) $N $N $T(($T) $N.$N)", IF, THIS, VALUE, INSTANCEOF, valueModelType, RETURN, NEW, modelType, valueModelType, THIS, VALUE);
            builder.addMethod(MethodSpec.methodBuilder(FROM)
                            .addModifiers(Modifier.PUBLIC)
                            .returns(builderType)
                            .addParameter(valueModelType, VALUE)
                            .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                            .addStatement("$N $N", RETURN, THIS)
                            .build())
                    .addMethod(MethodSpec.methodBuilder(parseMethod(SET, valueName))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(builderType)
                            .addParameter(valueModelType, VALUE)
                            .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                            .addStatement("$N $N", RETURN, THIS)
                            .build());
        });

        builder.addMethod(build.addStatement("$N $N", RETURN, NULL)
                .build());

        return builder;
    }
}
