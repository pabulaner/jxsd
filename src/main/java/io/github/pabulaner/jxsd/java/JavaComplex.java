package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaComplex(Group group, JavaType type, List<JavaComplex> inners, List<JavaField> fields) implements JavaClass {

    public enum Group {

        SEQUENCE,
        UNION,
    }
}
