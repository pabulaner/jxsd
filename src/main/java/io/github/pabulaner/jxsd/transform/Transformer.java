package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaComplex;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.java.JavaName;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.java.JavaType;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Transformer {

    private final Map<List<String>, RootTransform> transforms;

    public Transformer(List<URL> xml) throws IOException {
        XmlMapper mapper = new XmlMapper();
        transforms = new HashMap<>();

        for (URL value : xml) {
            RootTransform transform = mapper.readValue(value, RootTransform.class);
            transforms.put(transform.getPkg(), transform);
        }
    }

    public JavaResult transform(JavaResult input) {
        List<JavaClass> result = new ArrayList<>(input.classes());

        result.forEach(value -> {
            transform(value, this::applyInterfaces);
            transform(value, this::applyRefactors);
        });

        result.addAll(createInterfaces());
        return new JavaResult(input.scope(), result);
    }

    private void transform(JavaClass input, Consumer<JavaClass> function) {
        function.accept(input);

        if (input instanceof JavaComplex casted) {
            casted.getInners().forEach(inner -> transform(inner, function));
        }
    }

    private void applyInterfaces(JavaClass input) {
        ClassTransform transform = findTransform(input.getType());

        if (transform != null) {
            transform.getInterfaces().forEach(iface -> {
                JavaType type = new JavaType(input.getType().getPkg(), new JavaName(iface.getName()));
                input.getInterfaces().add(type);
            });
        }
    }

    private void applyRefactors(JavaClass input) {
        JavaType type = input.getType();
        RefactorTransform rename = findRefactor(type, ClassTransform::getRename);

        if (rename != null) {
            type.setName(new JavaName(rename.getWith()));
        }

        if (input instanceof JavaComplex casted) {
            casted.getFields().forEach(field -> {
                JavaType fieldType = field.getType();
                RefactorTransform fieldTypeReplace = findRefactor(fieldType, ClassTransform::getReplace);
                RefactorTransform fieldTypeRename = findRefactor(fieldType, ClassTransform::getRename);
                RefactorTransform fieldNameRename = findRefactor(type.getPkg(), type.getOuter(), field.getName().getName(), ClassTransform::getRename);

                if (fieldTypeReplace != null) {
                    fieldType.getOuter().clear();
                    fieldType.setName(new JavaName(fieldTypeReplace.getWith()));
                }

                if (fieldTypeRename != null) {
                    fieldType.setName(new JavaName(fieldTypeRename.getWith()));
                }

                if (fieldNameRename != null) {
                    field.setName(new JavaName(fieldNameRename.getWith()));
                }
            });
        }
    }

    private void applyRenames(JavaClass input, ClassTransform transform) {
        String name = input.getType().getName().getName();

        if (input instanceof JavaComplex casted) {
            casted.getFields().forEach(field -> {
                RefactorTransform fieldType = transform.getReplace(field.getType().getName().getName());
                RefactorTransform fieldName = transform.getReplace(field.getName().getName());

                if (fieldType != null) {
                    field.getType().setName(new JavaName(fieldType.getWith()));
                }

                if (fieldName != null) {
                    field.setName(new JavaName(fieldName.getWith()));
                }
            });
        }
    }

    private RefactorTransform findRefactor(JavaType type, BiFunction<ClassTransform, String, RefactorTransform> refactor) {
        return findRefactor(type.getPkg(), type.getOuter(), type.getName().getName(), refactor);
    }

    private RefactorTransform findRefactor(List<String> pkg, List<JavaName> outer, String name, BiFunction<ClassTransform, String, RefactorTransform> refactor) {
        ClassTransform transform = findTransform(pkg, outer, name);

        return transform != null
                ? refactor.apply(transform, name)
                : null;
    }

    private ClassTransform findTransform(JavaType type) {
        return findTransform(type.getPkg(), type.getOuter(), type.getName().getName());
    }

    private ClassTransform findTransform(List<String> pkg, List<JavaName> outer, String name) {
        ClassTransform transform = transforms.get(pkg);

        for (JavaName value : outer) {
            if (transform != null) {
                transform = transform.getClass(value.getName());
            }
        }

        return transform;
    }

    private List<JavaInterface> createInterfaces() {
        List<JavaInterface> result = new ArrayList<>();

        transforms.values().forEach(transform -> transform.getInterfaces()
                .stream()
                .map(iface -> {
                    JavaType type = new JavaType(transform.getPkg(), new JavaName(iface.getName()));
                    return new JavaInterface(type);
                })
                .forEach(result::add));

        return result;
    }
}
