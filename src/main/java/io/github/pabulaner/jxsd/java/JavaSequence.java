package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaSequence(JavaType type, List<JavaClass> inners, List<JavaField> fields) implements JavaComplex {

    public JavaSequence {
        inners = List.copyOf(inners);
        fields = List.copyOf(fields);
    }
}
