package io.github.pabulaner.jxsd.spec.resolver;

import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.transform.ClassTransform;
import io.github.pabulaner.jxsd.transform.RefactorTransform;
import io.github.pabulaner.jxsd.transform.TransformMap;

import java.util.List;

public class TransformResolver implements Resolver {

    private final TransformMap map;

    public TransformResolver(TransformMap map) {
        this.map = map;
    }

    @Override
    public JavaType resolve(JavaType original, JavaType type) {
        ClassTransform transform = map.findTransform(type, false);

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
        ClassTransform transform = map.findTransform(type);

        if (transform == null) {
            return name;
        }

        RefactorTransform rename = transform.getRename(name);
        return rename != null ? rename.getWith() : name;
    }
}
