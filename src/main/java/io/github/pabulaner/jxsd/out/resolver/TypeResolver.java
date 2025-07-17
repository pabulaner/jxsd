package io.github.pabulaner.jxsd.out.resolver;

import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.Name;

import java.util.List;

/**
 * Resolves the type by adding a suffix to the type and all outer types.
 */
public class TypeResolver implements Resolver {

    private final String kind;

    public TypeResolver(String kind) {
        this.kind = new Name(kind).toUpper();
    }

    @Override
    public JavaType resolve(JavaType type) {
        List<String> outer = type.outer()
                .stream()
                .map(value -> value + kind)
                .toList();

        return new JavaType(type.pkg(), outer, type.name() + kind, type.minOccurs(), type.maxOccurs());
    }
}
