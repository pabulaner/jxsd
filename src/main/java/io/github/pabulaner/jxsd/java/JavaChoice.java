package io.github.pabulaner.jxsd.java;

import java.util.Collections;
import java.util.List;

public record JavaChoice(JavaType type, List<JavaClass> inners, List<JavaField> fields) implements JavaComplex {

    public JavaChoice {
        inners = List.copyOf(inners);
        fields = List.copyOf(fields);
    }
}
