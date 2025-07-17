package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.Util;
import io.github.pabulaner.jxsd.out.resolver.PkgResolver;

import javax.lang.model.element.Modifier;
import java.util.List;

public abstract class ConverterParser<TClass extends JavaClass> extends BaseParser<TClass> {

    protected static final String BUILD = "build";

    protected static final String FROM = "from";

    private final PkgResolver modelResolver;

    protected ConverterParser() {
        this(ClassType.CLASS, new PkgResolver(List.of(), "converter"));
    }

    protected ConverterParser(PkgResolver resolver) {
        this(ClassType.CLASS, resolver);
    }

    protected ConverterParser(ClassType classType, PkgResolver resolver) {
        super(classType, resolver);
        modelResolver = new PkgResolver(List.of(), "model");
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, TClass clazz) {
        MethodSpec.Builder convertFromDocx4j = MethodSpec.methodBuilder("fromDocx4j")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(Util.convertType(clazz.type(), modelResolver))
                .addParameter(parseDocx4jType(clazz), VALUE)
                .addStatement("$N ($N == $N) $N $N", IF, VALUE, NULL, RETURN, NULL);

        MethodSpec.Builder convertToDocx4j = MethodSpec.methodBuilder("toDocx4j")
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(parseDocx4jType(clazz))
                .addParameter(Util.convertType(clazz.type(), modelResolver), VALUE)
                .addStatement("$N $N", RETURN, NULL);

        return builder.addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PRIVATE)
                        .build())
                .addMethod(parseFromDocx4j(convertFromDocx4j, clazz).build())
                .addMethod(parseToDocx4j(convertToDocx4j, clazz).build());
    }

    protected abstract MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, TClass clazz);

    protected abstract MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, TClass clazz);

    public TypeName parseDocx4jType(TClass clazz) {
        return Util.convertType(clazz.type(), getResolver());
    }

    public PkgResolver getModelResolver() {
        return modelResolver;
    }
}
