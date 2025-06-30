package io.github.pabulaner.jxsd.out.model;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.java.JavaName;

import javax.lang.model.element.Modifier;

public class ChoiceModelParser extends ModelParser<JavaChoice> {

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaChoice clazz) {
        // add inners
        clazz.inners().forEach(inner -> builder.addType(new ModelParserMap().parse(true, inner)));

        // add fields and constructors
        builder.addField(Integer.class, TYPE, Modifier.PRIVATE, Modifier.FINAL)
                .addField(Object.class, VALUE, Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N(-1, $N)", THIS, NULL)
                        .build())
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PRIVATE)
                        .addParameter(Integer.class, TYPE)
                        .addParameter(Object.class, VALUE)
                        .addStatement("$N.$N = $N", THIS, TYPE, TYPE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .build());

        ClassName type = parseType(clazz.type(), JavaName::toModel);
        int[] index = { 0 };

        // parse fields
        clazz.fields().forEach(field -> {
            ClassName fieldType = parseType(field.type(), JavaName::toModel);
            JavaName fieldName = field.name();

            // add static methods and is and get methods
            builder.addMethod(MethodSpec.methodBuilder(parseMethod(NEW, fieldName.toUpper()))
                            .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                            .returns(type)
                            .addParameter(fieldType, VALUE)
                            .addStatement("$N $N $T($L, $N)", RETURN, NEW, type, index[0], VALUE)
                            .build())
                    .addMethod(MethodSpec.methodBuilder(parseMethod(IS, fieldName.toUpper()))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(Boolean.class)
                            .addStatement("$N $N.$N == $L", RETURN, THIS, TYPE, index[0])
                            .build())
                    .addMethod(MethodSpec.methodBuilder(parseMethod(GET, fieldName.toUpper()))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(fieldType)
                            .addStatement("$N ($T) $N.$N", RETURN, fieldType, THIS, VALUE)
                            .build());

            index[0] += 1;
        });

        return builder;
    }
}
