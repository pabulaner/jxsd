package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.parser.model.ModelParserGroup;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import javax.lang.model.element.Modifier;

public abstract class ConverterParser<TClass extends JavaClass> extends BaseParser<TClass> {

    protected static final String FROM = "from";

    protected static final String TO = "to";

    protected static final String DOCX4J = "docx4j";

    protected ConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, TClass clazz) {
        MethodSpec.Builder convertFromDocx4j = MethodSpec.methodBuilder(ParserUtil.convertMethodName(FROM, DOCX4J))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(ParserUtil.convertType(clazz.type(), getModelResolver()))
                .addParameter(parseDocx4jType(clazz), VALUE)
                .addStatement("$N ($N == $N) $N $N", IF, VALUE, NULL, RETURN, NULL);

        MethodSpec.Builder convertToDocx4j = MethodSpec.methodBuilder(ParserUtil.convertMethodName(TO, DOCX4J))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(parseDocx4jType(clazz))
                .addParameter(ParserUtil.convertType(clazz.type(), getModelResolver()), VALUE)
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
        return ParserUtil.convertType(clazz.type(), getResolver());
    }

    public Resolver getModelResolver() {
        return getGroup()
                .getMap()
                .getGroup(ModelParserGroup.NAME)
                .getResolver();
    }

    public Resolver getDocx4jResolver() {
        return ((ConverterParserGroup) getGroup()).getDocx4jResolver();
    }
}
