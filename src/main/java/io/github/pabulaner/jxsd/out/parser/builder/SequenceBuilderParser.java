package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaSequence;
import io.github.pabulaner.jxsd.out.util.Name;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class SequenceBuilderParser extends BuilderParser<JavaSequence> {

    public SequenceBuilderParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaSequence clazz) {
        clazz.inners().forEach(inner -> builder.addType(getGroup().parse(true, inner)));

        TypeName builderType = ParserUtil.convertType(clazz.type(), getResolver());
        TypeName modelType = ParserUtil.convertType(clazz.type(), getModelResolver());

        MethodSpec.Builder build = MethodSpec.methodBuilder(BUILD)
                .addModifiers(Modifier.PUBLIC)
                .returns(modelType)
                .addCode("$N $N $T(", RETURN, NEW, modelType);

        MethodSpec.Builder from = MethodSpec.methodBuilder(FROM)
                .addModifiers(Modifier.PUBLIC)
                .returns(builderType)
                .addParameter(modelType, VALUE);

        builder.addMethod(MethodSpec.constructorBuilder()
                .addModifiers(Modifier.PUBLIC)
                .build());

        boolean[] first = { true };

        clazz.fields().forEach(field -> {
            TypeName fieldType = ParserUtil.convertType(field.type(), getModelResolver());
            Name fieldName = new Name(getResolver().resolve(field.type(), field.name()));

            if (first[0]) {
                first[0] = false;
            } else {
                build.addCode(", ");
            }

            build.addCode("$N.$N", THIS, fieldName.toVarLower());
            from.addStatement("$N.$N = $N.$N()", THIS, fieldName.toVarLower(), VALUE, ParserUtil.convertMethodName(GET, fieldName.toVarUpper()));

            builder.addField(fieldType, fieldName.toVarLower(), Modifier.PRIVATE)
                    .addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(SET, fieldName.toVarUpper()))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(builderType)
                            .addParameter(fieldType, fieldName.toVarLower())
                            .addStatement("$N.$N = $N", THIS, fieldName.toVarLower(), fieldName.toVarLower())
                            .addStatement("$N $N", RETURN, THIS)
                            .build());
        });

        return builder.addMethod(build.addCode(");")
                        .build())
                .addMethod(from.addStatement("$N $N", RETURN, THIS)
                        .build());
    }
}
