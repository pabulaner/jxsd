package io.github.pabulaner.jxsd.out.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

import java.util.ArrayList;
import java.util.List;

/**
 * Resolves the type by putting it inside the provided pkg.
 */
public class PkgResolver implements Resolver {

    private final List<String> pkg;

    public PkgResolver(List<String> pkg) {
        this.pkg = new ArrayList<>(pkg);
    }

    public JavaType resolve(JavaType type) {
        List<String> fullPkg = new ArrayList<>(pkg);
        fullPkg.addAll(type.pkg());

        return new JavaType(fullPkg, type.outer(), type.name(), type.minOccurs(), type.maxOccurs());
    }
}
