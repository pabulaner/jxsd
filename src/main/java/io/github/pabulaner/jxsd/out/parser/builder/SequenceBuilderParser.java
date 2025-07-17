package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.out.Name;
import io.github.pabulaner.jxsd.out.Util;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class SequenceBuilderParser extends BuilderParser<JavaSequence> {

    public SequenceBuilderParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        // add inners
        clazz.inners().forEach(inner -> builder.addType(getGroup().parse(true, inner)));

        // types
        TypeName builderType = Util.convertType(clazz.type(), getResolver());
        TypeName modelType = Util.convertType(clazz.type(), getModelResolver());

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
            TypeName fieldType = Util.convertType(field.type(), getModelResolver());
            Name fieldName = new Name(getResolver().resolve(field.type(), field.name()));

            if (first[0]) {
                first[0] = false;
            } else {
                build.addCode(", ");
            }

            build.addCode("$N.$N", THIS, fieldName.toVar());
            from.addStatement("$N.$N = $N.$N()", THIS, fieldName.toVar(), VALUE, Util.convertMethodName(GET, fieldName.toUpper()));

            // add fields and setters
            builder.addField(fieldType, fieldName.toVar(), Modifier.PRIVATE)
                    .addMethod(MethodSpec.methodBuilder(Util.convertMethodName(SET, fieldName.toUpper()))
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
