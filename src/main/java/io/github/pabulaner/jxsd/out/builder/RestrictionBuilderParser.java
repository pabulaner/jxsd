package io.github.pabulaner.jxsd.out.builder;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;

public class RestrictionBuilderParser extends BuilderParser<JavaRestriction> {

    @Override
    public TypeSpec.Builder parse(TypeSpec.Builder builder, JavaRestriction clazz) {
        JavaPrimitive primitive = new JavaPrimitive(clazz.type(), clazz.primitive());
        return new PrimitiveBuilderParser().parse(builder, primitive);
    }
}
