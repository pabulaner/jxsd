package io.github.pabulaner.jxsd.out.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

import java.util.ArrayList;
import java.util.List;

public class Resolver {

    private final List<String> pkg;

    private final String kind;

    public Resolver(List<String> pkg, String kind) {
        this.pkg = new ArrayList<>(pkg);
        this.kind = new Name(kind).toUpper();

        this.pkg.add(kind);
    }

    public JavaType type(JavaType type) {
        List<String> fullPkg = new ArrayList<>(pkg);
        List<String> outer = type.outer()
                .stream()
                .map(value -> value + kind)
                .toList();

        fullPkg.addAll(type.pkg());
        fullPkg = fullPkg.stream()
                .filter(value -> !value.matches("\\d+"))
                .toList();

        return new JavaType(fullPkg, outer, type.name() + kind, type.minOccurs(), type.maxOccurs());
    }

    public Name name(JavaType outer, String name) {
        return new Name(name);
    }
}
