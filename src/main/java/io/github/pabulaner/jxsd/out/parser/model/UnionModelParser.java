package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;
import java.util.List;

public class UnionModelParser extends BaseParser<JavaUnion> {

    public UnionModelParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, JavaUnion clazz) {
        // Unions are a special case in docx4j
        return builder.addField(String.class, VALUE, Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(String.class, VALUE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .build())
                .addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(GET, VALUE))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(String.class)
                        .addStatement("$N $N.$N", RETURN, THIS, VALUE)
                        .build());

//        builder.addField(Object.class, VALUE, Modifier.PRIVATE, Modifier.FINAL)
//                .addMethod(MethodSpec.constructorBuilder()
//                        .addModifiers(Modifier.PUBLIC)
//                        .addStatement("$N.$N = $N", THIS, VALUE, NULL)
//                        .build());
//
//        clazz.types().forEach(type -> {
//            TypeName valueType = ParserUtil.convertType(type, getResolver());
//            String valueName = type.name();
//
//            builder.addMethod(MethodSpec.constructorBuilder()
//                            .addModifiers(Modifier.PUBLIC)
//                            .addParameter(valueType, VALUE)
//                            .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
//                            .build())
//                    .addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(IS, valueName))
//                            .addModifiers(Modifier.PUBLIC)
//                            .returns(TypeName.BOOLEAN)
//                            .addStatement("$N $N.$N $N $T", RETURN, THIS, VALUE, INSTANCEOF, valueType)
//                            .build())
//                    .addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(GET, valueName))
//                            .addModifiers(Modifier.PUBLIC)
//                            .returns(valueType)
//                            .addStatement("$N ($T) $N.$N", RETURN, valueType, THIS, VALUE)
//                            .build());
//        });
//
//        return builder;
    }
}
