package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.Util;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class UnionModelParser extends BaseParser<JavaUnion> {

    public UnionModelParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaUnion clazz) {
        builder.addField(Object.class, VALUE, Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
                        .build());

        clazz.types().forEach(type -> {
            TypeName valueType = Util.convertType(type, getResolver());
            String valueName = type.name();

            builder.addMethod(MethodSpec.constructorBuilder()
                            .addModifiers(Modifier.PUBLIC)
                            .addParameter(valueType, VALUE)
                            .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                            .build())
                    .addMethod(MethodSpec.methodBuilder(Util.convertMethodName(IS, valueName))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(TypeName.BOOLEAN)
                            .addStatement("$N $N.$N $N $T", RETURN, THIS, VALUE, INSTANCEOF, valueType)
                            .build())
                    .addMethod(MethodSpec.methodBuilder(Util.convertMethodName(GET, valueName))
                            .addModifiers(Modifier.PUBLIC)
                            .returns(valueType)
                            .addStatement("$N ($T) $N.$N", RETURN, valueType, THIS, VALUE)
                            .build());
        });

        return builder;
    }
}
