package io.github.pabulaner.jxsd.java;

import io.github.pabulaner.jxsd.xsd.XsdComplexStruct;
import io.github.pabulaner.jxsd.xsd.XsdElementValue;
import io.github.pabulaner.jxsd.xsd.XsdGroupValue;
import io.github.pabulaner.jxsd.xsd.XsdRestriction;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import io.github.pabulaner.jxsd.xsd.XsdScope;
import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdStruct;
import io.github.pabulaner.jxsd.xsd.XsdType;
import io.github.pabulaner.jxsd.xsd.XsdValue;
import org.docx4j.dml.chart.CTAxDataSource;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
                .filter(file -> file.content().type().pkg() != null)
                .toList();
    }

    private JavaFile parse(XsdStruct struct) {
        return switch (struct) {
            case XsdSimpleStruct.XsdPrimitiveStruct casted -> parsePrimitive(casted);
            case XsdSimpleStruct.XsdRestrictionStruct casted -> parseRestriction(casted);
            case XsdSimpleStruct.XsdListStruct casted -> parseList(casted);
            case XsdSimpleStruct.XsdUnionStruct casted -> parseUnion(casted);
            case XsdComplexStruct casted -> parseComplex(casted);
            default -> throw new IllegalStateException("Unexpected value: " + struct);
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
        JavaType parent = parseParent(struct.type());
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

        List<String> imports = List.of();

        if (types.size() > 1) {
            imports = toImports(types);
        }

        JavaUnion result = new JavaUnion(type, types);
        return new JavaFile(JavaFile.Type.UNION, imports, result);
    }

    private JavaFile parseComplex(XsdComplexStruct struct) {
        JavaType type = parseType(struct.type(), false);
        JavaComplex.Group kind = JavaComplex.Group.SEQUENCE;

        List<XsdValue> values = struct.values();

        if (values.size() == 1) {
            XsdValue value = values.getFirst();

            if (value instanceof XsdGroupValue group && group.kind() == XsdGroupValue.Kind.UNION) {
                kind = JavaComplex.Group.UNION;
                values = group.values();
            }
        }

        List<String> imports = new ArrayList<>();
        List<JavaComplex> inners = new ArrayList<>();
        List<JavaField> fields = new ArrayList<>();

        values.forEach(value -> parseValue(value, imports, inners, fields));

        JavaComplex result = new JavaComplex(kind, type, inners, fields);
        return new JavaFile(JavaFile.Type.COMPLEX, imports, result);
    }

    private void parseValue(XsdValue value, List<String> imports, List<JavaComplex> inners, List<JavaField> fields) {
        switch (value) {
            case XsdElementValue casted -> parseElement(casted, imports, fields);
            case XsdGroupValue casted -> parseGroup(casted, imports, inners, fields);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private void parseElement(XsdElementValue value, List<String> imports, List<JavaField> fields) {
        JavaType type = parseType(value.type(), value.maxOccurs() > 1);
        JavaType name = new JavaType(null, value.name(), false);

        imports.addAll(toImports(type));
        fields.add(new JavaField(type, name));
    }

    private void parseGroup(XsdGroupValue value, List<String> imports, List<JavaComplex> inners, List<JavaField> fields) {
        if (value.kind() == XsdGroupValue.Kind.UNION || value.maxOccurs() > 1) {
            String name = parseGroupName(value);
            JavaType type = new JavaType(null, name, value.maxOccurs() > 1);

            fields.add(new JavaField(type, type));

            XsdType xsdType = new XsdType(null, name, null, null);
            XsdComplexStruct xsdStruct = new XsdComplexStruct(xsdType, value.values());

            JavaFile file = parse(xsdStruct);
            JavaComplex inner = (JavaComplex) file.content();
            JavaComplex.Group group = value.kind() == XsdGroupValue.Kind.SEQUENCE
                    ? JavaComplex.Group.SEQUENCE
                    : JavaComplex.Group.UNION;

            inner = new JavaComplex(group, inner.type(), inner.inners(), inner.fields());

            imports.addAll(file.imports());
            inners.add(inner);
        } else {
            value.values().forEach(val -> parseValue(val, imports, inners, fields));
        }
    }

    private JavaType parseType(XsdType type, boolean isList) {
        return new JavaType(toPackage(type.scope()), type.name(), isList);
    }

    private JavaType parseParent(XsdType type) {
        return new JavaType(toPackage(type.parentScope()), type.parentName(), false);
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

    private String parseGroupName(XsdGroupValue value) {
        return parseGroupName(value, 3);
    }

    private String parseGroupName(XsdGroupValue value, int maxNameCount) {
        List<XsdValue> values = value.values();
        StringBuilder result = new StringBuilder();

        String separator = value.kind() == XsdGroupValue.Kind.SEQUENCE
                ? "And"
                : "Or";

        for (int i = 0; i < maxNameCount && i < values.size(); i++) {
            String name = switch (values.get(i)) {
                case XsdElementValue casted -> casted.name();
                case XsdGroupValue casted -> parseGroupName(casted, 1);
                default -> throw new IllegalStateException("Unexpected value: " + values.get(i));
            };

            if (!result.isEmpty()) {
                result.append(separator)
                        .append(name.substring(0, 1).toUpperCase())
                        .append(name.substring(1));
            } else {
                result.append(name);
            }
        }

        return result.toString();
    }

    private String toPackage(String scope) {
        if (scope == null) {
            return basePkg;
        }

        try {
            URL url = URI.create(scope).toURL();

            if (url.getHost().equals("www.w3.org")) {
                return null;
            }

            String[] parts = url.getPath().split("/");

            return basePkg + Arrays.stream(parts)
                    .filter(part -> !part.equals("ooxml") && !part.equals("main"))
                    .collect(Collectors.joining("."));
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
                .map(type -> List.of(
                        type.pkg() + "." + type.toModel(),
                        type.pkg() + "." + type.toConverter(),
                        type.toDocx4j()
                ))
                .flatMap(List::stream)
                .toList();

        return new ArrayList<>(result);
    }
}
