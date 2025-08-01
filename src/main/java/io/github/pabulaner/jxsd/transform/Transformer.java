package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaComplex;
import io.github.pabulaner.jxsd.java.JavaField;
import io.github.pabulaner.jxsd.java.JavaInterface;
import io.github.pabulaner.jxsd.java.JavaMethod;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.util.Name;
import org.docx4j.dml.chart.CTBoolean;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Transformer {

    private final Map<List<String>, RootTransform> transforms;

    private Map<JavaType, List<JavaType>> implementations;

    public Transformer(List<URL> xml) throws IOException {
        XmlMapper mapper = new XmlMapper();
        transforms = new HashMap<>();
        implementations = null;

        for (URL value : xml) {
            RootTransform transform = mapper.readValue(value, RootTransform.class);
            transforms.put(transform.getPkg(), transform);
        }
    }

    public TransformResult transform(JavaResult input) {
        implementations = new HashMap<>();
        List<JavaClass> classes = new ArrayList<>(removeReplaced(input.classes()));

        classes.addAll(createInterfaces());
        classes = classes.stream()
                .peek(this::applyInterfaces)
                .toList();

        return new TransformResult(input.scope(), implementations, classes);
    }

    private void applyInterfaces(JavaClass input) {
        if (input instanceof JavaComplex casted) {
            casted.getInners().forEach(this::applyInterfaces);
        }

        ClassTransform transform = findTransform(input.getType());
        List<JavaType> result = new ArrayList<>();

        if (transform != null) {
            transform.getInterfaces().forEach(iface -> result.add(new JavaType.Builder()
                    .setPkg(input.getType().getPkg())
                    .setName(iface.getName())
                    .build()));
        }

        implementations.put(input.getType(), List.copyOf(result));
    }

    private RefactorTransform findRefactor(JavaType type, BiFunction<ClassTransform, String, RefactorTransform> refactor) {
        return findRefactor(type.getPkg(), type.getOuter(), new Name(type.getName()).toUpper(), refactor);
    }

    private RefactorTransform findRefactor(List<String> pkg, List<String> outer, String name, BiFunction<ClassTransform, String, RefactorTransform> refactor) {
        ClassTransform transform = findTransform(pkg, outer, null);

        return transform != null
                ? refactor.apply(transform, name)
                : null;
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

    private List<JavaClass> removeReplaced(List<JavaClass> input) {
        return input.stream()
                .filter(clazz -> {
                    RefactorTransform refactor = findRefactor(clazz.getType(), ClassTransform::getReplace);
                    return refactor == null;
                })
                .map(clazz -> {
                    if (clazz instanceof JavaComplex casted) {
                        return casted.builder()
                                .setInners(removeReplaced(casted.getInners()))
                                .build();
                    }

                    return clazz;
                })
                .toList();
    }

    private List<JavaInterface> createInterfaces() {
        List<JavaInterface> result = new ArrayList<>();

        transforms.values().forEach(transform -> transform.getInterfaces()
                .stream()
                .map(iface -> {
                    JavaType type = new JavaType.Builder()
                            .setPkg(transform.getPkg())
                            .setName(iface.getName())
                            .build();

                    List<JavaMethod> methods = iface.getMethods()
                            .stream()
                            .map(method -> {
                                List<String> pkg = transform.getPkg();

                                if(method.getPkg() != null) {
                                    pkg = List.of(method.getPkg().split("\\."));
                                }

                                String methodName = method.getName();
                                JavaType methodType = new JavaType.Builder()
                                        .setPkg(pkg)
                                        .setName(method.getType())
                                        .setMinOccurs(0)
                                        .setMaxOccurs(method.isList() ? Integer.MAX_VALUE : 1)
                                        .build();

                                return new JavaMethod.Builder()
                                        .setName(methodName)
                                        .setType(methodType)
                                        .setIsGeneric(method.isGeneric())
                                        .build();
                            })
                            .toList();

                    List<JavaType> interfaces = iface.getExt()
                            .stream()
                            .map(val -> new JavaType.Builder()
                                    .setPkg(transform.getPkg())
                                    .setName(val.getName())
                                    .build())
                            .toList();

                    return new JavaInterface.Builder()
                            .setType(type)
                            .setInterfaces(interfaces)
                            .setMethods(methods)
                            .build();
                })
                .forEach(result::add));

        return result;
    }
}
