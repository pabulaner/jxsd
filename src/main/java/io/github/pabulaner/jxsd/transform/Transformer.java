package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaComplex;
import io.github.pabulaner.jxsd.java.JavaField;
import io.github.pabulaner.jxsd.java.JavaResult;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.out.util.Name;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
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
        List<JavaClass> classes = new ArrayList<>(input.classes());

        removeReplaced(classes);
        classes.addAll(createInterfaces());

        classes.forEach(value -> {
            applyInterfaces(value);
            classes.add(transform(value, this::applyRefactors));
        });

        return new TransformResult(input.scope(), implementations, classes);
    }

    private JavaClass transform(JavaClass input, Function<JavaClass, JavaClass> function) {
        if (input instanceof JavaComplex casted) {
            List<JavaClass> inners = casted.inners()
                    .stream()
                    .map(inner -> transform(inner, function))
                    .toList();

            input = TransformUtil.withInnersAndFields(casted, inners, casted.fields());
        }

        return function.apply(input);
    }

    private void applyInterfaces(JavaClass input) {
        if (input instanceof JavaComplex casted) {
            casted.inners().forEach(this::applyInterfaces);
        }

        ClassTransform transform = findTransform(input.type());
        List<JavaType> result = new ArrayList<>();

        if (transform != null) {
            transform.getInterfaces().forEach(iface -> {
                JavaType type = new JavaType(input.type().pkg(), iface.getName());
                result.add(type);
            });
        }

        implementations.put(input.type(), result);
    }

    private JavaClass applyRefactors(JavaClass input) {
        JavaType type = input.type();

        if (input instanceof JavaComplex casted) {
            List<JavaField> fields = casted.fields()
                    .stream()
                    .map(field -> {
                        JavaType fieldType = field.type();
                        List<String> outer = new ArrayList<>(type.outer());
                        outer.add(type.name());

                        RefactorTransform fieldTypeReplace = findRefactor(fieldType, ClassTransform::getReplace);
                        RefactorTransform fieldTypeRename = findRefactor(fieldType, ClassTransform::getRename);
                        RefactorTransform fieldNameRename = findRefactor(type.pkg(), outer, new Name(field.name()).toLower(), ClassTransform::getRename);

                        if (fieldTypeReplace != null) {
                            fieldType.outer().clear();
                            fieldType = TransformUtil.withName(fieldType, fieldTypeReplace.getWith());
                        }

                        if (fieldTypeRename != null) {
                            fieldType = TransformUtil.withName(fieldType, fieldTypeRename.getWith());
                        }

                        if (fieldNameRename != null) {
                            field = TransformUtil.withName(field, fieldNameRename.getWith());
                        }

                        return TransformUtil.withType(field, fieldType);
                    })
                    .toList();

            input = TransformUtil.withInnersAndFields(casted, casted.inners(), fields);
        }

        RefactorTransform rename = findRefactor(type, ClassTransform::getRename);

        if (rename != null) {
            return TransformUtil.withType(input, TransformUtil.withName(type, rename.getWith()));
        }

        return input;
    }

    private RefactorTransform findRefactor(JavaType type, BiFunction<ClassTransform, String, RefactorTransform> refactor) {
        return findRefactor(type.pkg(), type.outer(), new Name(type.name()).toUpper(), refactor);
    }

    private RefactorTransform findRefactor(List<String> pkg, List<String> outer, String name, BiFunction<ClassTransform, String, RefactorTransform> refactor) {
        ClassTransform transform = findTransform(pkg, outer, null);

        return transform != null
                ? refactor.apply(transform, name)
                : null;
    }

    private ClassTransform findTransform(JavaType type) {
        return findTransform(type.pkg(), type.outer(), type.name());
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

    private void removeReplaced(List<JavaClass> input) {
        for (Iterator<JavaClass> it = input.iterator(); it.hasNext(); ) {
            JavaClass clazz = it.next();
            RefactorTransform refactor = findRefactor(clazz.type(), ClassTransform::getReplace);

            if (refactor != null) {
                it.remove();
            } else if (clazz instanceof JavaComplex casted) {
                removeReplaced(casted.inners());
            }
        }
    }

    private List<JavaInterface> createInterfaces() {
        List<JavaInterface> result = new ArrayList<>();

        transforms.values().forEach(transform -> transform.getInterfaces()
                .stream()
                .map(iface -> {
                    JavaType type = new JavaType(transform.getPkg(), iface.getName());

                    List<JavaInterface.Method> methods = iface.getMethods()
                            .stream()
                            .map(method -> {
                                List<String> pkg = transform.getPkg();

                                if(method.getPkg() != null) {
                                    pkg = List.of(method.getPkg().split("\\."));
                                }

                                String methodName = method.getName();
                                JavaType methodType = new JavaType(pkg, method.getType(), 0, method.isList() ? Integer.MAX_VALUE : 1);

                                return new JavaInterface.Method(methodName, methodType, method.isWildcard());
                            })
                            .toList();

                    List<JavaType> ext = iface.getExt()
                            .stream()
                            .map(val -> new JavaType(transform.getPkg(), val.getName()))
                            .toList();

                    return new JavaInterface(type, ext, methods);
                })
                .forEach(result::add));

        return result;
    }
}
