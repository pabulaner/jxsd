package io.github.pabulaner.jxsd.java;

public record JavaList(JavaType type, JavaType itemType) implements JavaClass {

    @Override
    public JavaList withType(JavaType type) {
        return new JavaList(type, itemType);
    }
}
