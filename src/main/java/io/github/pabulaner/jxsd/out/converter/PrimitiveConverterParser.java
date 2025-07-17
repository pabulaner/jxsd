package io.github.pabulaner.jxsd.out.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.builder.PrimitiveBuilderParser;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import javax.lang.model.element.Modifier;
import java.util.List;

public class PrimitiveConverterParser extends ConverterParser<JavaPrimitive> {

    public MethodSpec.Builder parse(MethodSpec.Builder builder, JavaRestriction clazz) {
        return parse(builder, clazz.type(), clazz.primitive());
    }

    @Override
    public MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaPrimitive clazz) {
        return parse(builder, clazz.type(), clazz.type());
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaPrimitive clazz) {
        return builder;
    }

    private MethodSpec.Builder parse(MethodSpec.Builder builder, JavaType type, JavaType primitive) {
        TypeName modelType = parseType(type, getModelResolver());
        return builder.addStatement("$N $N $T($N)", RETURN, NEW, modelType, VALUE);
    }

    @Override
    public TypeName parseDocx4jType(JavaPrimitive clazz) {
        return parsePrimitive(clazz.type());
    }
}
