package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaUnion(JavaType type, List<JavaType> types) implements JavaClass {

    public JavaUnion {
        types = List.copyOf(types);
    }
}
