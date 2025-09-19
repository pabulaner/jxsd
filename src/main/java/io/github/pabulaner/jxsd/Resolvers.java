package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.java.JavaClass;
import io.github.pabulaner.jxsd.java.JavaPrimitive;
import io.github.pabulaner.jxsd.java.JavaRestriction;
import io.github.pabulaner.jxsd.java.JavaScope;
import io.github.pabulaner.jxsd.java.JavaType;
import io.github.pabulaner.jxsd.spec.resolver.PrimitiveResolver;
import io.github.pabulaner.jxsd.spec.resolver.SwitchResolver;
import io.github.pabulaner.jxsd.spec.resolver.TransformResolver;
import io.github.pabulaner.jxsd.transform.TransformMap;
import io.github.pabulaner.jxsd.util.Name;
import io.github.pabulaner.jxsd.spec.resolver.PkgCleanResolver;
import io.github.pabulaner.jxsd.spec.resolver.PkgParentResolver;
import io.github.pabulaner.jxsd.spec.resolver.PkgRenameResolver;
import io.github.pabulaner.jxsd.spec.resolver.Resolver;
import io.github.pabulaner.jxsd.spec.resolver.TypeRenameResolver;
import io.github.pabulaner.jxsd.util.Pair;
import org.docx4j.wml.P;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public final class Resolvers {

    private Resolvers() {
        // empty
    }

    public static Resolver getDefault(JavaScope scope, List<String> pkg, String type, TransformMap map) {
        pkg = new ArrayList<>(pkg);
        pkg.add(new Name(type).toLower());

        Predicate<JavaType> primitivePredicate = value -> {
            JavaClass spec = scope.get(value);
            System.out.println(spec.getClass());
            return spec instanceof JavaPrimitive || spec instanceof JavaRestriction;
        };

        Resolver primitiveResolver = new PrimitiveResolver(scope);
        Resolver typeRenameResolver = new TypeRenameResolver((inner, value) -> {
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

        return Resolver.combine(
                new TransformResolver(map),
                new PkgParentResolver(pkg),
                new PkgCleanResolver(),
                new SwitchResolver(
                        List.of(new Pair<>(primitivePredicate, primitiveResolver)),
                        typeRenameResolver));
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
