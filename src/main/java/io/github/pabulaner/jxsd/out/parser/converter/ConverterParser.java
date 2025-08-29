package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.BaseParser;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;
import io.github.pabulaner.jxsd.out.parser.model.ModelParserGroup;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import javax.lang.model.element.Modifier;
import java.util.stream.Collectors;

public abstract class ConverterParser<TClass extends JavaClass> extends BaseParser<TClass> {

    protected static final String FROM = "from";

    protected static final String TO = "to";

    protected static final String DOCX4J = "docx4j";

    protected static final String VAL = "val";

    protected static final String RESULT = "result";

    protected static final String CLEAR = "clear";

    protected static final String ADD_ALL = "addAll";

    protected static final String STREAM = "stream";

    protected static final String MAP = "map";

    protected static final String COLLECT = "collect";

    protected static final String TO_LIST = "toList";

    protected static final TypeName COLLECTORS_TYPE = ClassName.get(Collectors.class);

    protected ConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected TypeSpec.Builder parse(TypeSpec.Builder builder, TClass clazz) {
        MethodSpec.Builder convertFromDocx4j = MethodSpec.methodBuilder(ParserUtil.convertMethodName(FROM, DOCX4J))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(ParserUtil.convertType(clazz.getType(), getModelResolver()))
                .addParameter(parseDocx4jType(clazz), VALUE);

        MethodSpec.Builder convertToDocx4j = MethodSpec.methodBuilder(ParserUtil.convertMethodName(TO, DOCX4J))
                .addModifiers(Modifier.PUBLIC, Modifier.STATIC)
                .returns(parseDocx4jType(clazz))
                .addParameter(ParserUtil.convertType(clazz.getType(), getModelResolver()), VALUE);

        convertFromDocx4j.addStatement("$N ($N == $N) $N $N", IF, VALUE, NULL, RETURN, NULL);
        convertToDocx4j.addStatement("$N ($N == $N) $N $N", IF, VALUE, NULL, RETURN, NULL);

        return builder.addMethod(MethodSpec.constructorBuilder()
                        .addModifiers(Modifier.PRIVATE)
                        .build())
                .addMethod(parseFromDocx4j(convertFromDocx4j, clazz).build())
                .addMethod(parseToDocx4j(convertToDocx4j, clazz).build());
    }

    protected abstract MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, TClass clazz);

    protected abstract MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, TClass clazz);

    public TypeName parseDocx4jType(TClass clazz) {
        return ParserUtil.convertType(clazz.getType(), getDocx4jResolver());
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
