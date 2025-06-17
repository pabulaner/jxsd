package io.github.pabulaner.jxsd.java;

public record JavaComplex(JavaType type, JavaClass inners, JavaField fields) implements JavaClass {
}
