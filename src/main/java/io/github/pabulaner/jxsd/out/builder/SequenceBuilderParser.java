package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaSequence;

import javax.lang.model.element.Modifier;

public class SequenceBuilderParser extends BuilderParser<JavaSequence> {

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        // add inners
        clazz.inners().forEach(inner -> builder.addType(new BuilderParserMap().parse(true, inner)));

        // types
        ClassName builderType = parseType(clazz.type(), JavaName::toBuilder);
        ClassName modelType = parseType(clazz.type(), JavaName::toModel);

        MethodSpec.Builder build = MethodSpec.methodBuilder(BUILD)
                .addModifiers(Modifier.PUBLIC)
                .returns(modelType)
                .addCode("$N $N $T(", RETURN, NEW, modelType);

        MethodSpec.Builder from = MethodSpec.methodBuilder(FROM)
                .addModifiers(Modifier.PUBLIC)
                .returns(builderType)
                .addParameter(modelType, VALUE);

        // init constructor
        builder.addMethod(MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .build());

        boolean[] first = { true };

        // parse fields
        clazz.fields().forEach(field -> {
            ClassName fieldType = parseType(field.type(), JavaName::toModel);
            JavaName fieldName = field.name();

            if (first[0]) {
                first[0] = false;
            } else {
                build.addCode(", ");
            }

            build.addCode("$N.$N", THIS, fieldName.toVar());
            from.addStatement("$N.$N = $N.$N()", THIS, fieldName.toVar(), VALUE, parseMethod(GET, fieldName.toVar()));

            // add fields and setters
            builder.addField(fieldType, fieldName.toVar(), Modifier.PRIVATE)
                    .addMethod(MethodSpec.methodBuilder(parseMethod(SET, fieldName.toUpper()))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(builderType)
                            .addParameter(fieldType, fieldName.toVar())
                            .addStatement("$N.$N = $N", THIS, fieldName.toVar(), fieldName.toVar())
                            .addStatement("$N $N", RETURN, THIS)
                            .build());
        });

        // add constructor and return result
        return builder.addMethod(build.addCode(");")
                        .build())
                .addMethod(from.build());
    }
}
