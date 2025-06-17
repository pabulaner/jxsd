package io.github.pabulaner.jxsd.java;

import io.github.pabulaner.jxsd.xsd.XsdResult;
import io.github.pabulaner.jxsd.xsd.XsdScope;
import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdStruct;
import io.github.pabulaner.jxsd.xsd.XsdType;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class JavaParser {

    private final String basePkg;

    private XsdScope scope;

    public JavaParser(String basePkg) {
        Objects.requireNonNull(basePkg);

        this.basePkg = basePkg;
        this.scope = null;
    }

    public List<JavaFile> parse(XsdResult xsd) {
        scope = xsd.scope();
        return xsd.structs()
                .stream()
                .map(this::parse)
                .filter(Objects::nonNull)
                .toList();
    }

    private JavaFile parse(XsdStruct struct) {
        return switch (struct) {
            case XsdSimpleStruct.XsdPrimitiveStruct casted -> parsePrimitive(casted);
            default -> null; // throw new IllegalStateException("Unexpected value: " + struct);
        };
    }

    private JavaFile parsePrimitive(XsdSimpleStruct.XsdPrimitiveStruct struct) {
        XsdType type = struct.type();
        String name = type.name();

        JavaType primitiveType = JavaType.createPrimitive(name);
        JavaPrimitive primitive = new JavaPrimitive(new JavaType(null, name, null, primitiveType.name(), false));

        return new JavaFile(JavaFile.Type.PRIMITIVE, toPackage(type.scope()), toImports(primitiveType), primitive);
    }

    private JavaFile parseRestriction(XsdSimpleStruct.XsdRestrictionStruct struct) {
        XsdType type = struct.type();
        String pkg = toPackage(type.scope());
        String parentPkg = toPackage(type.parentScope());
        List<String> imports = new ArrayList<>();

        if (!pkg.equals(parentPkg)) {

        }

        JavaType restrictionType = new JavaType(toPackage(type.scope()), type.name(), toPackage(type.parentScope()), type.parentName(), false);
        JavaRestriction restriction = new JavaRestriction()
    }

    private String toPackage(String scope) {
        if (scope == null) {
            return basePkg;
        }

        try {
            URL url = URI.create(scope).toURL();
            String[] parts = url.getPath().split("/");

            for (int i = 0; i < parts.length; i++) {
                // check if parts[i] only contains digits
                if (parts[i].matches("\\d+")) {
                    parts[i] = "_" + parts[i];
                }
            }

            return basePkg + String.join(".", parts);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> toImports(JavaType... types) {
        return Arrays.stream(types)
                .filter(type -> type.pkg() != null)
                .map(type -> type.pkg() + "." + type.toUpper())
                .toList();
    }
}
