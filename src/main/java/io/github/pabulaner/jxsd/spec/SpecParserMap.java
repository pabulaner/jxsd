package io.github.pabulaner.jxsd.spec;

import io.github.pabulaner.jxsd.java.JavaClass;

import java.util.HashMap;
import java.util.Map;

public class SpecParserMap implements SpecParser {

    private final Map<Class<? extends JavaClass>, SpecParser> parsers;

    public SpecParserMap() {
        parsers = new HashMap<>();
    }

    @Override
    public void parse(SpecContext ctx) {
        Class<?> clazz = ctx.get(SpecKey.SPEC).getClass();
        SpecParser parser = parsers.get(clazz);

        if (parser != null) {
            parser.parse(ctx);
        } else {
            ctx.abort();
        }
    }

    public <TSpec extends JavaClass> SpecParserMap add(Class<TSpec> clazz, SpecParser parser) {
        parsers.put(clazz, parser);
        return this;
    }
}
