package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.out.resolver.TransformResolver;
import io.github.pabulaner.jxsd.transform.TransformMap;
import io.github.pabulaner.jxsd.util.Name;
import io.github.pabulaner.jxsd.out.resolver.PkgCleanResolver;
import io.github.pabulaner.jxsd.out.resolver.PkgParentResolver;
import io.github.pabulaner.jxsd.out.resolver.PkgRenameResolver;
import io.github.pabulaner.jxsd.out.resolver.Resolver;
import io.github.pabulaner.jxsd.out.resolver.TypeRenameResolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class Resolvers {

    private Resolvers() {
        // empty
    }

    public static Resolver getDefault(List<String> pkg, String type, TransformMap map) {
        pkg = new ArrayList<>(pkg);
        pkg.add(new Name(type).toLower());

        return Resolver.combine(
                new TransformResolver(map),
                new PkgParentResolver(pkg),
                new PkgCleanResolver(),
                new TypeRenameResolver((inner, value) -> {
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
                }));
    }

    public static Resolver getDocx4j() {
        Map<String, String> rename = new HashMap<>();
        rename.put("drawingml", "dml");
        rename.put("main", "");

        return Resolver.combine(
                new PkgRenameResolver(rename),
                new PkgParentResolver(List.of("org", "docx4j")),
                new PkgCleanResolver(),
                new TypeRenameResolver((inner, value) -> new Name(value).toUpper().replace("_", "")));
    }
}
