package io.github.pabulaner.jxsd.spec.parser.converter;

import com.squareup.javapoet.MethodSpec;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecParser;

public class PrimitiveConverterParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        MethodSpec.Builder fromBuilder = ctx.get(ConverterParser.FROM_BUILDER);
        MethodSpec.Builder toBuilder = ctx.get(ConverterParser.TO_BUILDER);

        fromBuilder.addStatement("return value");
        toBuilder.addStatement("return value");

        ctx.next();
    }
}
