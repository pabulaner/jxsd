package io.github.pabulaner.jxsd.parser;

import java.util.HashMap;
import java.util.Map;

public class ParserMap {

    private final Map<Class<?>, Parser<?>> parsers;

    public ParserMap() {
        parsers = new HashMap<>();
    }

    public <T> void register(Class<T> xsClass, Parser<T> parser) {
        parsers.put(xsClass, parser);
    }

    @SuppressWarnings("unchecked")
    public <T> Parser<T> get(Class<T> xsClass) {
        Parser<T> parser = (Parser<T>) parsers.get(xsClass);

        if (parser == null) {
            throw new IllegalArgumentException("No parser found for class '" + xsClass + "'");
        }

        return parser;
    }
}
