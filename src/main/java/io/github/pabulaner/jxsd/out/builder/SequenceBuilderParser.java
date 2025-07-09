package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaSequence;

import javax.lang.model.element.Modifier;

public class SequenceBuilderParser extends BuilderParser<JavaSequence> {

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        // add inners
        clazz.getInners().forEach(inner -> builder.addType(new BuilderParserMap().parse(true, inner)));

        // types
        TypeName builderType = parseType(clazz.getType(), JavaName::toBuilder);
        TypeName modelType = parseType(clazz.getType(), JavaName::toModel);

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
        clazz.getFields().forEach(field -> {
            TypeName fieldType = parseType(field.getType(), JavaName::toModel);
            JavaName fieldName = field.getName();

            if (first[0]) {
                first[0] = false;
            } else {
                build.addCode(", ");
            }

            build.addCode("$N.$N", THIS, fieldName.toVar());
            from.addStatement("$N.$N = $N.$N()", THIS, fieldName.toVar(), VALUE, parseMethod(GET, fieldName.toUpper()));

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
                .addMethod(from.addStatement("$N $N", RETURN, THIS)
                        .build());
    }
}
