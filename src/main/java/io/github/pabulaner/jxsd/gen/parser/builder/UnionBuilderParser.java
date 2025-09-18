package io.github.pabulaner.jxsd.gen.parser.builder;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class UnionBuilderParser extends BuilderParser<JavaUnion> {

    public UnionBuilderParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaUnion clazz) {
        super.parse(builder, clazz);

        JavaType type = clazz.getType();
        TypeName builderType = ParserUtil.convertType(type, getResolver());
        TypeName modelType = ParserUtil.convertType(type, getModelResolver());

        return builder
                .addModifiers(Modifier.PUBLIC)
                .addField(String.class, VALUE, Modifier.PRIVATE)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .build())
                .addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(SET, VALUE))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(builderType)
                        .addParameter(String.class, VALUE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .addStatement("return $N", THIS)
                        .build())
                .addMethod(MethodSpec.methodBuilder(FROM)
                        .addModifiers(Modifier.PUBLIC)
                        .returns(builderType)
                        .addParameter(modelType, VALUE)
                        .addStatement("$N.$N = $N.$N()", THIS, VALUE, VALUE, ParserUtil.convertMethodName(GET, VALUE))
                        .addStatement("$N $N", RETURN, THIS)
                        .build())
                .addMethod(MethodSpec.methodBuilder(BUILD)
                        .addModifiers(Modifier.PUBLIC)
                        .returns(modelType)
                        .addStatement("$N $N $T($N.$N)", RETURN, NEW, modelType, THIS, VALUE)
                        .build());

//        TypeName builderType = ParserUtil.convertType(clazz.getType(), getResolver());
//        TypeName modelType = ParserUtil.convertType(clazz.getType(), getModelResolver());
//
//        MethodSpec.Builder build = MethodSpec.methodBuilder(BUILD)
//                .addModifiers(Modifier.PUBLIC)
//                .returns(modelType);
//
//        builder.addField(Object.class, VALUE, Modifier.PRIVATE)
//                .addMethod(MethodSpec.constructorBuilder()
//                        .addModifiers(Modifier.PUBLIC)
//                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
//                        .build());
//
//        clazz.types().forEach(type -> {
//            TypeName valueModelType = ParserUtil.convertType(type, getModelResolver());
//            String valueName = new Name(getResolver().resolve(type, type.name())).toVarUpper();
//
//            build.addStatement("$N ($N.$N $N $T) $N $N $T(($T) $N.$N)", IF, THIS, VALUE, INSTANCEOF, valueModelType, RETURN, NEW, modelType, valueModelType, THIS, VALUE);
//            builder.addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(SET, valueName))
//                            .addModifiers(Modifier.PUBLIC)
//                            .returns(builderType)
//                            .addParameter(valueModelType, VALUE)
//                            .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
//                            .addStatement("$N $N", RETURN, THIS)
//                            .build())
//                    .addMethod(MethodSpec.methodBuilder(FROM)
//                            .addModifiers(Modifier.PUBLIC)
//                            .returns(builderType)
//                            .addParameter(valueModelType, VALUE)
//                            .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
//                            .addStatement("$N $N", RETURN, THIS)
//                            .build());
//        });
//
//        builder.addMethod(build.addStatement("$N $N", RETURN, NULL)
//                .build());
//
//        return builder;
    }
}
