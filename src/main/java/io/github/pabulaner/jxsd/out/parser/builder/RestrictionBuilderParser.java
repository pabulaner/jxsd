package io.github.pabulaner.jxsd.out.parser.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaRestriction;

public class RestrictionBuilderParser extends BuilderParser<JavaRestriction> {

    @Override
    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaRestriction clazz) {
        return new PrimitiveBuilderParser().parse(builder, clazz);
    }
}
