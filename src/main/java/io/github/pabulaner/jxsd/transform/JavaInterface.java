package io.github.pabulaner.jxsd.transform;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaType;

import java.util.List;

public record JavaInterface(JavaType type, List<JavaType> ext, List<Method> methods) implements JavaClass {

    public record Method(String name, JavaType type, boolean wildcard) {
    }
}
