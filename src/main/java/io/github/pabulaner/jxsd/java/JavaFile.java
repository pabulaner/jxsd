package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaFile(Type type, List<String> imports, JavaClass content) {

    public enum Type {

        PRIMITIVE,
        RESTRICTION,
        LIST,
        UNION,
        ENUM,
        COMPLEX_SEQUENCE,
        COMPLEX_UNION,
    }
}
