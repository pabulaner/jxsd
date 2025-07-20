package io.github.pabulaner.jxsd.out.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.out.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class PrimitiveModelParser extends BaseParser<JavaPrimitive> {

    public PrimitiveModelParser(ParserGroup group) {
        super(group);
    }

    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaPrimitive clazz) {
        TypeName primitiveType = ParserUtil.convertPrimitive(clazz.type());

        return builder
                .addField(primitiveType, VALUE, Modifier.PRIVATE, Modifier.FINAL)
                .addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PUBLIC)
                        .addParameter(primitiveType, VALUE)
                        .addStatement("$N.$N = $N", THIS, VALUE, VALUE)
                        .build())
                .addMethod(MethodSpec.methodBuilder(ParserUtil.convertMethodName(GET, VALUE))
                        .addModifiers(Modifier.PUBLIC)
                        .returns(primitiveType)
                        .addStatement("$N $N.$N", RETURN, THIS, VALUE)
                        .build());
    }
}
