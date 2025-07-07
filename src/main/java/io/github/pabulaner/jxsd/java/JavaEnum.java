package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaEnum(JavaType type, List<String> values) implements JavaClass {

    @Override
    public JavaEnum withType(JavaType type) {
        return new JavaEnum(type, values);
    }
}
