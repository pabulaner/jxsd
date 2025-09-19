package io.github.pabulaner.jxsd.spec;

import io.github.pabulaner.jxsd.java.JavaClass;

import java.util.function.Predicate;

public class SpecParserFilter implements SpecParser {

    private final Predicate<SpecContext> condition;

    public SpecParserFilter(Predicate<SpecContext> condition) {
        this.condition = condition;
    }

    @Override
    public void parse(SpecContext ctx) {
        if (condition.test(ctx)) {
            ctx.next();
        } else {
            ctx.abort();
        }
    }
}
