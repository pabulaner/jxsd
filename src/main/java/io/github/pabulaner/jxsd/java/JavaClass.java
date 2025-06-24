package io.github.pabulaner.jxsd.java;

public interface JavaClass {

    JavaType type();

    default String name() {
        return getClass().getSimpleName();
    }
}
