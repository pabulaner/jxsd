package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaChoice;
import io.github.pabulaner.jxsd.util.Name;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class ChoiceBuilderParser extends BuilderParser<JavaChoice> {

    public ChoiceBuilderParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaChoice clazz) {
        super.parse(builder, clazz);
        clazz.getInners().forEach(inner -> builder.addType(getGroup().parse(true, inner)));

        TypeName builderType = ParserUtil.convertType(clazz.getType(), getResolver());
        TypeName modelType = ParserUtil.convertType(clazz.getType(), getModelResolver());

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

        builder.addField(TypeName.INT, TYPE, Modifier.PRIVATE)
                .addField(Object.class, VALUE, Modifier.PRIVATE)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N.$N = -1", THIS, TYPE)
                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
                        .build());

        int[] index = { 0 };

        clazz.getFields().forEach(field -> {
            TypeName fieldType = ParserUtil.convertType(field.getType(), getModelResolver());
            String fieldName = new Name(getResolver().resolve(clazz.getType(), field.getName())).toVarUpper();

            build.addStatement("$N ($N.$N == $L) $N $T.$N(($T) $N.$N)", IF, THIS, TYPE, index[0], RETURN, modelType, ParserUtil.convertMethodName(NEW, fieldName), fieldType, THIS, VALUE);
            from.beginControlFlow("$N ($N.$N())", IF, VALUE, ParserUtil.convertMethodName(IS, fieldName))
                    .addStatement("$N.$N = $L", THIS, TYPE, index[0])
                    .addStatement("$N.$N = $N.$N()", THIS, VALUE, VALUE, ParserUtil.convertMethodName(GET, fieldName))
                    .endControlFlow();

            builder.addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(SET, fieldName))
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
