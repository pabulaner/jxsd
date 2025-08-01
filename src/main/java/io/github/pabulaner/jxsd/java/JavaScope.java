package io.github.pabulaner.jxsd.java;

import java.util.HashMap;
import java.util.Map;

public class JavaScope {

    private final Map<JavaType, JavaClass> classes;

    public JavaScope() {
        classes = new HashMap<>();
    }

    public void declare(JavaClass clazz) {
        classes.put(clazz.getType(), clazz);
    }

    public JavaClass get(JavaType type) {
        return classes.get(type);
    }
}
