package io.github.pabulaner.jxsd.gen.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.gen.util.ParserUtil;
import io.github.pabulaner.jxsd.gen.parser.ParserGroup;

public class PrimitiveConverterParser extends ConverterParser<JavaPrimitive> {

    public PrimitiveConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    public MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaPrimitive clazz) {
        return parseFromDocx4j(builder, clazz.getType());
    }

    public MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaRestriction clazz) {
        return parseFromDocx4j(builder, clazz.getType());
    }

    private MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaType type) {
        TypeName modelType = ParserUtil.convertType(type, getModelResolver());
        return builder.addStatement("$N $N $T($N)", RETURN, NEW, modelType, VALUE);
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaPrimitive clazz) {
        return parseToDocx4j(builder, clazz.getType());
    }

    public MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaRestriction clazz) {
        return parseToDocx4j(builder, clazz.getType());
    }

    private MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaType type) {
        return builder.addStatement("$N $N.$N()", RETURN, VALUE, ParserUtil.convertGetterName(type, VALUE));
    }

    @Override
    public TypeName parseDocx4jType(JavaPrimitive clazz) {
        return ParserUtil.convertPrimitive(clazz.getType(), true);
    }
}
