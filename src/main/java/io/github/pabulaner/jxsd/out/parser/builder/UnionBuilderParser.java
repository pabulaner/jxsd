package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.Name;
import io.github.pabulaner.jxsd.out.Util;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class UnionBuilderParser extends BuilderParser<JavaUnion> {

    public UnionBuilderParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaUnion clazz) {
        TypeName builderType = Util.convertType(clazz.type(), getResolver());
        TypeName modelType = Util.convertType(clazz.type(), getModelResolver());

        MethodSpec.Builder build = MethodSpec.methodBuilder(BUILD)
                .addModifiers(Modifier.PUBLIC)
                .returns(modelType);

        builder.addField(Object.class, VALUE, Modifier.PRIVATE)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
                        .build());

        clazz.types().forEach(type -> {
            TypeName valueModelType = Util.convertType(type, getModelResolver());
            String valueName = new Name(getResolver().resolve(type, type.name())).toUpper();

            build.addStatement("$N ($N.$N $N $T) $N $N $T(($T) $N.$N)", IF, THIS, VALUE, INSTANCEOF, valueModelType, RETURN, NEW, modelType, valueModelType, THIS, VALUE);
            builder.addMethod(MethodSpec.methodBuilder(Util.convertMethodName(SET, valueName))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(builderType)
                            .addParameter(valueModelType, VALUE)
                            .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                            .addStatement("$N $N", RETURN, THIS)
                            .build())
                    .addMethod(MethodSpec.methodBuilder(FROM)
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
