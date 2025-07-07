package io.github.pabulaner.jxsd.java;

import java.util.ArrayList;
import java.util.List;

public record JavaSequence(JavaType type, List<JavaType> interfaces, List<JavaClass> inners, List<JavaField> fields) implements JavaComplex {

    public JavaSequence(JavaType type, List<JavaClass> inners, List<JavaField> fields) {
        this(type, new ArrayList<>(), inners, fields);
    }

    @Override
    public JavaSequence withType(JavaType type) {
        return new JavaSequence(type, inners, fields);
    }
}
