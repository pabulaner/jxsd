package io.github.pabulaner.jxsd.out.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

import java.util.List;
import java.util.Map;

public class PkgCleanResolver implements Resolver {

    @Override
    public JavaType resolve(JavaType type) {
        List<String> pkg = type.pkg()
                .stream()
                .filter(value -> !value.isEmpty() && !value.matches("\\d+"))
                .toList();

        return new JavaType(pkg, type.outer(), type.name(), type.minOccurs(), type.maxOccurs());
    }
}
