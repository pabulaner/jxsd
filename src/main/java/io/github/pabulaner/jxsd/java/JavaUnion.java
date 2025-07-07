package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaUnion(JavaType type, List<JavaType> types) implements JavaClass {

    @Override
    public JavaUnion withType(JavaType type) {
        return new JavaUnion(type, types);
    }
}
