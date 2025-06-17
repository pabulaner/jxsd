package io.github.pabulaner.jxsd.java;

import java.util.List;

public record JavaFile(Type type, String pkg, List<String> imports, JavaClass content) {

    public enum Type {

        PRIMITIVE,
    }
}
