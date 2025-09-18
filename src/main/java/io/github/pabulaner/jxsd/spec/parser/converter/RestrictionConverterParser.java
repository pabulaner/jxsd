package io.github.pabulaner.jxsd.spec.parser.converter;

import io.github.pabulaner.jxsd.spec.SpecContext;
import io.github.pabulaner.jxsd.spec.SpecParser;

public class RestrictionConverterParser implements SpecParser {

    @Override
    public void parse(SpecContext ctx) {
        new PrimitiveConverterParser().parse(ctx);
    }
}
