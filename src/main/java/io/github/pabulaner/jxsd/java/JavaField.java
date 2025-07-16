package io.github.pabulaner.jxsd.java;

public record JavaField(JavaType type, String name) {

    public JavaField(JavaType type, String name) {
        this.type = type;
        this.name = name;
    }
}
