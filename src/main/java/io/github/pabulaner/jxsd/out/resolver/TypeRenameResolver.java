package io.github.pabulaner.jxsd.out.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

import java.util.List;
import java.util.function.Function;

public class TypeRenameResolver implements Resolver {

    private final List<String> pkg;

    private final Function<String, String> rename;

    public TypeRenameResolver(Function<String, String> rename) {
        this(null, rename);
    }

    public TypeRenameResolver(List<String> pkg, Function<String, String> rename) {
        this.pkg = pkg;
        this.rename = rename;
    }

    @Override
    public JavaType resolve(JavaType type) {
        if (pkg != null && !pkg.equals(type.getPkg())) {
            return type;
        }

        List<String> outer = type.getOuter()
                .stream()
                .map(rename)
                .toList();

        return new JavaType.Builder(type)
                .setOuter(outer)
                .setName(rename.apply(type.getName()))
                .build();
    }
}
