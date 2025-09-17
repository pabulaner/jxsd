package io.github.pabulaner.jxsd.spec;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaParser;

import java.util.HashMap;
import java.util.Map;

public class SpecParserMap implements SpecParser<JavaClass> {

    private final Map<Class<? extends JavaClass>, SpecParser<JavaClass>> parsers;

    public SpecParserMap() {
        parsers = new HashMap<>();
    }

    @Override
    public void parse(SpecContext<JavaClass> ctx) {
        Class<?> clazz = ctx.spec().getClass();
        SpecParser<JavaClass> parser = parsers.get(clazz);

        if (parser == null) {
            throw new IllegalArgumentException("No spec parser found for class '" + clazz + "'");
        }

        parser.parse(ctx);
    }

    @SuppressWarnings("unchecked")
    public <TSpec extends JavaClass> void add(Class<TSpec> clazz, SpecParser<TSpec> parser) {
        parsers.put(clazz, ctx -> parser.parse((SpecContext<TSpec>) ctx));
    }
}
