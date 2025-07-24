package io.github.pabulaner.jxsd.java;

import java.util.List;
import java.util.Objects;

public record JavaType(List<String> pkg, List<String> outer, String name, int minOccurs, int maxOccurs) {

    public JavaType {
        pkg = List.copyOf(pkg);
        outer = List.copyOf(outer);
    }

    public JavaType(List<String> pkg, String name) {
        this(pkg, name, 1, 1);
    }

    public JavaType(List<String> pkg, List<String> outer, String name) {
        this(pkg, outer, name, 1, 1);
    }

    public JavaType(List<String> pkg, String name, int minOccurs, int maxOccurs) {
        this(pkg, List.of(), name, minOccurs, maxOccurs);
    }

    public boolean isList() {
        return maxOccurs > 1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != JavaType.class) {
            return false;
        }

        JavaType casted = (JavaType) obj;
        return Objects.equals(casted.pkg, pkg)
                && Objects.equals(casted.outer, outer)
                && Objects.equals(casted.name, name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkg, outer, name);
    }
}
