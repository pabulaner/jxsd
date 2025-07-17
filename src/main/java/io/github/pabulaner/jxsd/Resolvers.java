package io.github.pabulaner.jxsd;

import io.github.pabulaner.jxsd.out.Name;
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

    public static Resolver getDefault(List<String> pkg, String type) {
        pkg = new ArrayList<>(pkg);
        pkg.add(new Name(type).toLower());

        return Resolver.combine(
                new PkgParentResolver(pkg),
                new PkgCleanResolver(),
                new TypeRenameResolver(value -> new Name(value).toUpper() + new Name(type).toUpper()));
    }

    public static Resolver getDocx4j() {
        Map<String, String> rename = new HashMap<>();
        rename.put("drawingml", "dml");
        rename.put("main", "");

        return Resolver.combine(
                new PkgRenameResolver(rename),
                new PkgParentResolver(List.of("org", "docx4j")),
                new PkgCleanResolver(),
                new TypeRenameResolver(value -> new Name(value).toUpper().replace("_", "")));
    }
}
