package io.github.pabulaner.jxsd.out.parser.converter;

import com.squareup.javapoet.MethodSpec;
import com.squareup.javapoet.TypeName;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.util.ParserUtil;
import io.github.pabulaner.jxsd.out.util.RestrictionUtil;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class RestrictionConverterParser extends ConverterParser<JavaRestriction> {

    public RestrictionConverterParser(ParserGroup group) {
        super(group);
    }

    @Override
    public MethodSpec.Builder parseFromDocx4j(MethodSpec.Builder builder, JavaRestriction clazz) {
        return new PrimitiveConverterParser(getGroup()).parse(builder, clazz);
    }

    @Override
    protected MethodSpec.Builder parseToDocx4j(MethodSpec.Builder builder, JavaRestriction clazz) {
        return builder;
    }

    @Override
    public TypeName parseDocx4jType(JavaRestriction clazz) {
        JavaType primitive = RestrictionUtil.findPrimitive(getGroup().getMap().getScope(), clazz.type());
        return ParserUtil.convertPrimitive(primitive, true);
    }
}
