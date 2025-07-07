package io.github.pabulaner.jxsd.java;

import java.util.ArrayList;
import java.util.List;

public record JavaChoice(JavaType type, List<JavaType> interfaces, List<JavaClass> inners, List<JavaField> fields) implements JavaComplex {

    public JavaChoice(JavaType type, List<JavaClass> inners, List<JavaField> fields) {
        this(type, new ArrayList<>(), inners, fields);
    }

    @Override
    public JavaChoice withType(JavaType type) {
        return new JavaChoice(type, interfaces, inners, fields);
    }
}
