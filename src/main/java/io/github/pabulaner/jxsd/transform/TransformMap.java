package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.pabulaner.jxsd.java.JavaType;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TransformMap {

    private final Map<List<String>, RootTransform> transforms;

    public TransformMap(List<URL> xml) throws IOException {
        XmlMapper mapper = new XmlMapper();
        transforms = new HashMap<>();

        for (URL value : xml) {
            RootTransform transform = mapper.readValue(value, RootTransform.class);
            transforms.put(transform.getPkg(), transform);
        }
    }

    public ClassTransform findTransform(JavaType type) {
        return findTransform(type, true);
    }

    public ClassTransform findTransform(JavaType type, boolean isClass) {
        ClassTransform transform = transforms.get(type.getPkg());

        if (transform == null) {
            return null;
        }

        for (String value : type.getOuter()) {
            transform = transform.getClass(value);

            if (transform == null) {
                return null;
            }
        }

        if (isClass) {
            transform = transform.getClass(type.getName());
        }

        return transform;
    }

    public List<JavaType> findImplementations(JavaType type) {
        ClassTransform transform = findTransform(type);

        List<JavaType> result = new ArrayList<>();
        List<InterfaceTransform> interfaces = new ArrayList<>();

        if (transform != null) {
            interfaces.addAll(transform.getInterfaces());
        }

        if (type.getOuter().isEmpty()) {
            transform = transforms.get(type.getPkg());

            if (transform != null) {
                transform.getInterfaces().forEach(iface -> {
                    if (iface.getName().equals(type.getName())) {
                        interfaces.addAll(iface.getExt());
                    }
                });
            }
        }

        interfaces.forEach(iface -> result.add(new JavaType.Builder()
                .setPkg(type.getPkg())
                .setName(iface.getName())
                .build()));

        return result;
    }

    public Map<List<String>, RootTransform> getTransforms() {
        return transforms;
    }
}
