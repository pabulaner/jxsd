package io.github.pabulaner.jxsd.out.parser;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.HashMap;
import java.util.Map;

public class ParserGroup implements Parser<JavaClass> {

    private final ParserMap map;

    private final Resolver resolver;

    private final Map<Class<? extends JavaClass>, Parser<JavaClass>> parsers;

    public ParserGroup(ParserMap map, Resolver resolver) {
        this.map = map;
        this.resolver = resolver;
        this.parsers = new HashMap<>();
    }

    @Override
    public TypeSpec parse(boolean isStatic, JavaClass clazz) {
        return parsers.get(clazz.getClass()).parse(isStatic, clazz);
    }

    @SuppressWarnings("unchecked")
    public <TClass extends JavaClass> void addParser(Class<TClass> parserClass, Parser<TClass> parser) {
        parsers.put(parserClass, (isStatic, clazz) -> parser.parse(isStatic, (TClass) clazz));
    }

    public ParserMap getMap() {
        return map;
    }

    public Resolver getResolver() {
        return resolver;
    }
}
