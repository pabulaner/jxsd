package io.github.pabulaner.jxsd.out.resolver;

import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.Name;

import java.util.List;
import java.util.function.Function;

public class TypeRenameResolver implements Resolver {

    private final Function<String, String> rename;

    public TypeRenameResolver(Function<String, String> rename) {
        this.rename = rename;
    }

    @Override
    public JavaType resolve(JavaType type) {
        List<String> outer = type.outer()
                .stream()
                .map(rename)
                .toList();

        return new JavaType(type.pkg(), outer, rename.apply(type.name()), type.minOccurs(), type.maxOccurs());
    }
}
