package io.github.pabulaner.jxsd.api.java;

public interface IJavaType {

    enum Kind {

        OBJECT,
        RESTRICTION,
        LIST,
        UNION,
    }

    IJavaName name();

    IJavaName parent();

    Kind kind();
}
