package io.github.pabulaner.jxsd.spec.parser.fix;

import com.squareup.javapoet.MethodSpec;
import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecParser;
import io.github.pabulaner.jxsd.spec.parser.converter.ConverterParser;

public class SystemColorValConverterParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        MethodSpec.Builder fromBuilder = ctx.get(ConverterParser.FROM_BUILDER);
        MethodSpec.Builder toBuilder = ctx.get(ConverterParser.TO_BUILDER);

        fromBuilder.parameters.clear();
        fromBuilder.addParameter(String.class, "value").addStatement("return null");

        toBuilder.returns(String.class).addStatement("return null");
        ctx.next();
    }
}
