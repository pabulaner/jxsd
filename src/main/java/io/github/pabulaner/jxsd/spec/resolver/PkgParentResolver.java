package io.github.pabulaner.jxsd.spec.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

import java.util.ArrayList;
import java.util.List;

public class PkgParentResolver implements Resolver {

    private final List<String> pkg;

    public PkgParentResolver(List<String> pkg) {
        this.pkg = pkg;
    }

    public JavaType resolve(JavaType original, JavaType type) {
        List<String> fullPkg = new ArrayList<>(pkg);
        fullPkg.addAll(type.getPkg());

        return new JavaType.Builder(type)
                .setPkg(fullPkg)
                .build();
    }
}
