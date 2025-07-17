package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.out.Util;

import javax.lang.model.element.Modifier;

public class ChoiceBuilderParser extends BuilderParser<JavaChoice> {

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaChoice clazz) {
        // add inners
        clazz.inners().forEach(inner -> builder.addType(new BuilderParserGroup().parse(true, inner)));

        // types
        TypeName builderType = Util.convertType(clazz.type(), getResolver());
        TypeName modelType = Util.convertType(clazz.type(), getModelResolver());

        MethodSpec.Builder build = MethodSpec.methodBuilder(BUILD)
                .addModifiers(Modifier.PUBLIC)
                .returns(modelType)
                .addStatement("$N ($N.$N == -1) $N $N $T()", IF, THIS, TYPE, RETURN, NEW, modelType);

        MethodSpec.Builder from = MethodSpec.methodBuilder(FROM)
                .addModifiers(Modifier.PUBLIC)
                .returns(builderType)
                .addParameter(modelType, VALUE)
                .addStatement("$N.$N = -1", THIS, TYPE)
                .addStatement("$N.$N = $N", THIS, VALUE, NULL);
        
        // add fields and constructors
        builder.addField(TypeName.INT, TYPE, Modifier.PRIVATE)
                .addField(Object.class, VALUE, Modifier.PRIVATE)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N.$N = -1", THIS, TYPE)
                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
                        .build());

        int[] index = { 0 };

        // parse fields
        clazz.fields().forEach(field -> {
            TypeName fieldType = Util.convertType(field.type(), getModelResolver());
            String fieldName = getResolver().name(field.type(), field.name()).toUpper();

            build.addStatement("$N ($N.$N == $L) $N $T.$N(($T) $N.$N)", IF, THIS, TYPE, index[0], RETURN, modelType, Util.convertMethodName(NEW, fieldName), fieldType, THIS, VALUE);
            from.beginControlFlow("$N ($N.$N())", IF, VALUE, Util.convertMethodName(IS, fieldName))
                    .addStatement("$N.$N = $L", THIS, TYPE, index[0])
                    .addStatement("$N.$N = $N.$N()", THIS, VALUE, VALUE, Util.convertMethodName(GET, fieldName))
                    .endControlFlow();

            // add setters
            builder.addMethod(MethodSpec.methodBuilder(Util.convertMethodName(SET, fieldName))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(builderType)
                            .addParameter(fieldType, VALUE)
                            .addStatement("$N.$N = $L", THIS, TYPE, index[0])
                            .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                            .addStatement("$N $N", RETURN, THIS)
                            .build());

            index[0] += 1;
        });

        builder.addMethod(build.addStatement("$N $N", RETURN, NULL)
                        .build())
                .addMethod(from.addStatement("$N $N", RETURN, THIS)
                        .build());

        return builder;
    }
}
