package io.github.pabulaner.jxsd.java;

import io.github.pabulaner.jxsd.xsd.XsdRestriction;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import io.github.pabulaner.jxsd.xsd.XsdScope;
import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdStruct;
import io.github.pabulaner.jxsd.xsd.XsdType;
import org.checkerframework.checker.units.qual.A;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
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
            case XsdSimpleStruct.XsdRestrictionStruct casted -> parseRestriction(casted);
            case XsdSimpleStruct.XsdListStruct casted -> parseList(casted);
            case XsdSimpleStruct.XsdUnionStruct casted -> parseUnion(casted);
            default -> null; // throw new IllegalStateException("Unexpected value: " + struct);
        };
    }

    private JavaFile parsePrimitive(XsdSimpleStruct.XsdPrimitiveStruct struct) {
        JavaType type = parseType(struct.type(), false);
        JavaType primitive = JavaType.createPrimitive(struct.type().name());
        JavaPrimitive result = new JavaPrimitive(type, primitive);

        return new JavaFile(JavaFile.Type.PRIMITIVE, toImports(primitive), result);
    }

    private JavaFile parseRestriction(XsdSimpleStruct.XsdRestrictionStruct struct) {
        JavaType type = parseType(struct.type(), false);
        JavaType parent = parseParent(struct.type(), false);
        JavaType primitive = JavaType.createPrimitive(scope.getTopParent(struct.type()).name());

        List<String> enums = struct.restrictions()
                .stream()
                .filter(restriction -> "enumeration".equals(restriction.name()))
                .map(XsdRestriction::value)
                .map(this::parseEnum)
                .toList();

        if (enums.isEmpty()) {
            List<String> imports = toImports(primitive);
            imports.addAll(toImports(parent));

            JavaRestriction result = new JavaRestriction(type, parent, primitive, List.of());
            return new JavaFile(JavaFile.Type.RESTRICTION, imports, result);
        } else {
            JavaEnum result = new JavaEnum(type, enums);
            return new JavaFile(JavaFile.Type.ENUM, List.of(), result);
        }
    }

    private JavaFile parseList(XsdSimpleStruct.XsdListStruct struct) {
        JavaType type = parseType(struct.type(), false);
        JavaType itemType = parseType(struct.itemType(), false);
        JavaList result = new JavaList(type, itemType);

        return new JavaFile(JavaFile.Type.LIST, toImports(itemType), result);
    }

    private JavaFile parseUnion(XsdSimpleStruct.XsdUnionStruct struct) {
        JavaType type = parseType(struct.type(), false);
        List<JavaType> types = struct.types()
                .stream()
                .map(value -> parseType(value, false))
                .toList();

        JavaUnion result = new JavaUnion(type, types);
        return new JavaFile(JavaFile.Type.UNION, toImports(types), result);
    }

    private JavaType parseType(XsdType type, boolean isList) {
        return new JavaType(toPackage(type.scope()), type.name(), isList);
    }

    private JavaType parseParent(XsdType type, boolean isList) {
        return new JavaType(toPackage(type.parentScope()), type.parentName(), isList);
    }

    private String parseEnum(String value) {
        for (int i = 1; i < value.length(); i++) {
            if (Character.isUpperCase(value.charAt(i))) {
                value = value.substring(0, i) + "_" + value.substring(i++);
            }
        }

        // check if value begins with a digit
        if (value.matches("^\\d.*")) {
            value = "_" + value;
        }

        return value.toUpperCase();
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

    private List<String> toImports(JavaType type) {
        return toImports(List.of(type));
    }

    private List<String> toImports(Collection<JavaType> types) {
        List<String> result = types.stream()
                .filter(type -> type.pkg() != null)
                .map(type -> type.pkg() + "." + type.toUpper())
                .toList();

        return new ArrayList<>(result);
    }
}
