package io.github.pabulaner.jxsd.spec;

import io.github.pabulaner.jxsd.java.JavaClass;

import java.util.ArrayList;
import java.util.List;

public class SpecParserList<TSpec extends JavaClass> implements SpecParser<TSpec> {

    private final List<SpecParser<TSpec>> parsers;

    public SpecParserList() {
        this.parsers = new ArrayList<>();
    }

    @Override
    public void parse(SpecContext<TSpec> ctx) {
        parsers.forEach(parser -> parser.parse(ctx));
    }

    public void add(SpecParser<TSpec> parser) {
        parsers.add(parser);
    }
}
