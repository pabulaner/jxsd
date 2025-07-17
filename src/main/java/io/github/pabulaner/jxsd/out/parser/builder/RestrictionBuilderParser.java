package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.out.parser.ParserGroup;

public class RestrictionBuilderParser extends BuilderParser<JavaRestriction> {

    public RestrictionBuilderParser(ParserGroup group) {
        super(group);
    }

    @Override
    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaRestriction clazz) {
        return new PrimitiveBuilderParser(getGroup()).parse(builder, clazz);
    }
}
