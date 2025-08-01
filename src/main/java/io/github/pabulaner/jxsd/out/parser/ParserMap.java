package io.github.pabulaner.jxsd.out.parser;

import com.squareup.javapoet.TypeSpec;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class ParserMap {

    private final JavaScope scope;

    private final Map<JavaType, List<JavaType>> implementations;

    private final Map<String, ParserGroup> groups;

    public ParserMap(JavaScope scope, Map<JavaType, List<JavaType>> implementations) {
        this.scope = scope;
        this.implementations = implementations;
        this.groups = new HashMap<>();
    }

    public void parse(List<JavaClass> classes, BiConsumer<JavaType, TypeSpec> consumer) {
        classes.forEach(clazz -> groups.forEach((key, value) -> {
            JavaType type = value.getResolver().resolve(clazz.getType());
            TypeSpec result = value.parse(false, clazz);

            if (result != null) {
                consumer.accept(type, result);
            }
        }));
    }

    public void addGroup(String key, ParserGroup group) {
        groups.put(key, group);
    }

    public JavaScope getScope() {
        return scope;
    }

    public Map<JavaType, List<JavaType>> getImplementations() {
        return implementations;
    }

    public ParserGroup getGroup(String key) {
        return groups.get(key);
    }
}
