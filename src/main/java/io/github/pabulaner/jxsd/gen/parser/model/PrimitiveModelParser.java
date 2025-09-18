package io.github.pabulaner.jxsd.gen.parser.model;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;

import javax.lang.model.element.Modifier;

public class PrimitiveModelParser extends ModelParser<JavaPrimitive> {

    public PrimitiveModelParser(ParserGroup group) {
        super(group);
    }

    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaPrimitive clazz) {
        super.parse(builder, clazz);
        TypeName primitiveType = ParserUtil.convertPrimitive(clazz.getType());

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
