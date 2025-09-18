package io.github.pabulaner.jxsd.gen.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

import java.util.List;
import java.util.Map;

public class PkgRenameResolver implements Resolver {

    private final Map<String, String> rename;

    public PkgRenameResolver(Map<String, String> rename) {
        this.rename = rename;
    }

    @Override
    public JavaType resolve(JavaType type) {
        List<String> pkg = type.getPkg()
                .stream()
                .map(value -> rename.getOrDefault(value, value))
                .toList();

        return new JavaType.Builder(type)
                .setPkg(pkg)
                .build();
    }
}
