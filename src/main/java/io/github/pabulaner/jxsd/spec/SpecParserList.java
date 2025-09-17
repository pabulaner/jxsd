package io.github.pabulaner.jxsd.spec;

import io.github.pabulaner.jxsd.java.JavaClass;

import java.util.ArrayList;
import java.util.List;

public class SpecParserList implements SpecParser {

    private final List<SpecParser> parsers;

    public SpecParserList() {
        this.parsers = new ArrayList<>();
    }

    @Override
    public void parse(SpecContext ctx) {
        parsers.forEach(parser -> parser.parse(ctx));
    }

    public void add(SpecParser parser) {
        parsers.add(parser);
    }
}
