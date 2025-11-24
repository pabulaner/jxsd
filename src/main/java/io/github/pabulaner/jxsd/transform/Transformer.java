package io.github.pabulaner.jxsd.transform;

import io.github.pabulaner.jxsd.java.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Transformer {

    private final TransformMap map;

    public Transformer(List<URL> xml) throws IOException {
        map = new TransformMap(xml);
    }

    public TransformResult transform(JavaResult input) {
        List<JavaClass> classes = new ArrayList<>(removeReplaced(input.classes()));
        classes.addAll(createInterfaces());

        return new TransformResult(input.scope(), classes, map);
    }

    private RefactorTransform findReplace(JavaType type) {
        ClassTransform transform = map.findTransform(type, false);

        return transform != null
                ? transform.getReplace(type.getName())
                : null;
    }

    private List<JavaClass> removeReplaced(List<JavaClass> input) {
        return input.stream()
                .filter(clazz -> {
                    RefactorTransform refactor = findReplace(clazz.getType());
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

        map.getTransforms().values().forEach(transform -> transform.getInterfaces()
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

                    List<JavaType> interfaces = iface.getInterfaces()
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
