package io.github.pabulaner.jxsd.out.resolver;

import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.transform.ClassTransform;
import io.github.pabulaner.jxsd.transform.RefactorTransform;
import io.github.pabulaner.jxsd.transform.RootTransform;

import java.util.List;
import java.util.Map;

public class TransformResolver implements Resolver {

    private final Map<List<String>, RootTransform> transforms;

    public TransformResolver(Map<List<String>, RootTransform> transforms) {
        this.transforms = transforms;
    }

    @Override
    public JavaType resolve(JavaType type) {
        ClassTransform transform = findTransform(type);

        if (transform == null) {
            return type;
        }

        RefactorTransform rename = transform.getRename(type.getName());
        RefactorTransform replace = transform.getReplace(type.getName());

        JavaType.Builder builder = new JavaType.Builder(type);

        if (rename != null) {
            builder.setName(rename.getWith());
        }

        if (replace != null) {
            builder
                    .setOuter(List.of())
                    .setName(replace.getWith());
        }

        return builder.build();
    }

    @Override
    public String resolve(JavaType type, String name) {
        ClassTransform transform = findTransform(type.getPkg(), type.getOuter(), null);

        if (transform == null) {
            return name;
        }

        RefactorTransform rename = transform.getRename(name);
        return rename != null ? rename.getWith() : name;
    }

    private ClassTransform findTransform(JavaType type) {
        return findTransform(type.getPkg(), type.getOuter(), type.getName());
    }

    private ClassTransform findTransform(List<String> pkg, List<String> outer, String name) {
        ClassTransform transform = transforms.get(pkg);

        if (transform == null) {
            return null;
        }

        for (String value : outer) {
            transform = transform.getClass(value);

            if (transform == null) {
                return null;
            }
        }

        if (name != null) {
            transform = transform.getClass(name);
        }

        return transform;
    }
}
