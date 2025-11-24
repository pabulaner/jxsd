package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.java.*;
import io.github.pabulaner.jxsd.spec.resolver.*;
import io.github.pabulaner.jxsd.transform.TransformMap;
import io.github.pabulaner.jxsd.util.Name;
import io.github.pabulaner.jxsd.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public final class Resolvers {

    private Resolvers() {
        // empty
    }

    private static Resolver getTypeRenameResolver(String type) {
        return new TypeRenameResolver((inner, value) -> {
            String result = new Name(value).toUpper();
            String suffix = new Name(type).toUpper();

            if (inner) {
                return result;
            }

            int index = result.indexOf("_");

            boolean isValue = false;
            boolean isInterface = false;

            if (index >= 0) {
                String prefix = result.substring(0, index);

                if (prefix.equals("ST")) {
                    isValue = true;
                } else if (prefix.equals("IT")) {
                    isInterface = true;
                }
            } else {
                isValue = true;
            }

            if (isValue) {
                suffix = "Value" + suffix;
            }

            result = result.substring(index + 1) + suffix;

            if (isInterface) {
                result = "I" + result;
            }

            return result;
        });
    }

    public static Resolver getDefault(JavaScope scope, List<String> pkg, String type, TransformMap map) {
        pkg = new ArrayList<>(pkg);
        pkg.add(new Name(type).toLower());

        Predicate<JavaType> primitivePredicate = value -> {
            JavaClass spec = scope.get(value);
            return spec instanceof JavaPrimitive || spec instanceof JavaRestriction;
        };

        Resolver primitiveResolver = new PrimitiveResolver(scope);

        return Resolver.combine(
                new TransformResolver(map),
                new PkgParentResolver(pkg),
                new PkgCleanResolver(),
                new SwitchResolver(
                        List.of(new Pair<>(primitivePredicate, primitiveResolver)),
                        getTypeRenameResolver(type)));
    }

    public static Resolver getConverter(List<String> pkg, String type, TransformMap map) {
        pkg = new ArrayList<>(pkg);
        pkg.add(new Name(type).toLower());

        return Resolver.combine(
                new TransformResolver(map),
                new PkgParentResolver(pkg),
                new PkgCleanResolver(),
                getTypeRenameResolver(type));
    }

    public static Resolver getDocx4j() {
        Map<String, String> rename = new HashMap<>();
        rename.put("drawingml", "dml");
        rename.put("main", "");

        return Resolver.combine(
                new PkgRenameResolver(rename),
                new PkgParentResolver(List.of("org", "docx4j")),
                new PkgCleanResolver(),
                new TypeRenameResolver((inner, value) -> new Name(value)
                        .toUpper()
                        .replace("_", "")));
    }
}
