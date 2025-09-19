package io.github.pabulaner.jxsd.spec.resolver;

import io.github.pabulaner.jxsd.java.JavaType;

import java.util.List;

public class TypeRenameResolver implements Resolver {
    
    public interface Rename {
        
        String apply(boolean inner, String name);
    }

    private final List<String> pkg;

    private final Rename rename;

    public TypeRenameResolver(Rename rename) {
        this(null, rename);
    }

    public TypeRenameResolver(List<String> pkg, Rename rename) {
        this.pkg = pkg;
        this.rename = rename;
    }

    @Override
    public JavaType resolve(JavaType original, JavaType type) {
        if (pkg != null && !pkg.equals(type.getPkg())) {
            return type;
        }

        boolean[] inner = { false };

        List<String> outer = type.getOuter()
                .stream()
                .map(name -> {
                    String result = rename.apply(inner[0], name);
                    inner[0] = true;

                    return result;
                })
                .toList();

        return new JavaType.Builder(type)
                .setOuter(outer)
                .setName(rename.apply(inner[0], type.getName()))
                .build();
    }
}
