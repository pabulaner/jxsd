package io.github.pabulaner.jxsd.spec.parser.fix;

import com.squareup.javapoet.MethodSpec;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.parser.converter.ConverterParser;

public class SystemColorConverterParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        MethodSpec.Builder fromBuilder = ctx.get(ConverterParser.FROM_BUILDER);
        MethodSpec.Builder toBuilder = ctx.get(ConverterParser.TO_BUILDER);

        fromBuilder.addStatement("return null");
        toBuilder.addStatement("return null");

        ctx.next();
    }
}
