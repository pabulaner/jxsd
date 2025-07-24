package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.ClassName;
import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.java.JavaUnion;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class UnionConverterParser extends ConverterParser<JavaUnion> {

    public UnionConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    protected MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaUnion clazz) {
        TypeName type = ParserUtil.convertType(clazz.type(), getModelResolver());
        return builder.addStatement("$N $N $T($N)", RETURN, NEW, type, VALUE);
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaUnion clazz) {
        return builder;
    }

    @Override
    public TypeName parseDocx4jType(JavaUnion clazz) {
        return ClassName.get(String.class);
    }
}
