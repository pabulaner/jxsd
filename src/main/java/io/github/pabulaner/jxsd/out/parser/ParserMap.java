package io.github.pabulaner.jxsd.out.parser;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.out.resolver.Resolver;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ParserMap {

    private final Map<String, ParserGroup> groups;

    public ParserMap() {
        this.groups = new HashMap<>();
    }

    public void parse(List<JavaClass> classes, BiConsumer<Resolver, TypeSpec> consumer) {
        classes.forEach(clazz ->
                groups.forEach((key, value) ->
                        consumer.accept(value.getResolver(), value.parse(false, clazz))));
    }

    public void addGroup(String key, ParserGroup group) {
        groups.put(key, group);
    }

    public ParserGroup getGroup(String key) {
        return groups.get(key);
    }
}
