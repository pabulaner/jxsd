package io.github.pabulaner.jxsd.spec.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

import java.util.List;

public class PkgCleanResolver implements Resolver {

    @Override
    public JavaType resolve(JavaType type) {
        List<String> pkg = type.getPkg()
                .stream()
                .filter(value -> !value.isEmpty() && !value.matches("\\d+"))
                .toList();

        return new JavaType.Builder(type)
                .setPkg(pkg)
                .build();
    }
}
