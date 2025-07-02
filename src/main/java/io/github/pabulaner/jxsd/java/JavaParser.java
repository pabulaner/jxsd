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

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;

public class JavaParser {

    public record Config(List<String> basePkg, Map<String, String> pkgConverter) {
    }

    private final Config config;

    private XsdScope xsdScope;

    private JavaScope javaScope;

    private final Stack<JavaName> outer;

    public JavaParser(Config config) {
        this.config = config;
        this.xsdScope = null;
        this.javaScope = null;
        this.outer = new Stack<>();
    }

    public JavaResult parse(XsdResult xsd) {
        xsdScope = xsd.scope();
        javaScope = new JavaScope();

        List<JavaClass> classes = xsd.structs()
                .stream()
                .map(this::parse)
                .filter(Objects::nonNull)
                .filter(clazz -> clazz.type().pkg() != null)
                .toList();

        return new JavaResult(javaScope, classes);
    }

    private JavaClass parse(XsdStruct struct) {
        JavaClass result = switch (struct) {
            case XsdSimpleStruct.XsdPrimitiveStruct casted -> parsePrimitive(casted);
            case XsdSimpleStruct.XsdRestrictionStruct casted -> parseRestriction(casted);
            case XsdSimpleStruct.XsdListStruct casted -> parseList(casted);
            case XsdSimpleStruct.XsdUnionStruct casted -> parseUnion(casted);
            case XsdComplexStruct casted -> parseComplex(casted);
            default -> throw new IllegalStateException("Unexpected value: " + struct);
        };

        javaScope.declare(result);
        return result;
    }

    private JavaClass parsePrimitive(XsdSimpleStruct.XsdPrimitiveStruct struct) {
        JavaType type = parseType(struct.type(), false);
        JavaType primitive = JavaType.createPrimitive(struct.type().name());

        return new JavaPrimitive(type, primitive);
    }

    private JavaClass parseRestriction(XsdSimpleStruct.XsdRestrictionStruct struct) {
        JavaType type = parseType(struct.type(), false);
        JavaType parent = parseParent(struct.type());
        JavaType primitive = JavaType.createPrimitive(xsdScope.getTopParent(struct.type()).name());

        List<String> enums = struct.restrictions()
                .stream()
                .filter(restriction -> "enumeration".equals(restriction.name()))
                .map(XsdRestriction::value)
                .map(this::parseEnum)
                .toList();

        if (enums.isEmpty()) {
            return new JavaRestriction(type, parent, primitive, List.of());
        } else {
            return new JavaEnum(type, enums);
        }
    }

    private JavaClass parseList(XsdSimpleStruct.XsdListStruct struct) {
        JavaType type = parseType(struct.type(), false);
        JavaType itemType = parseType(struct.itemType(), false);

        return new JavaList(type, itemType);
    }

    private JavaClass parseUnion(XsdSimpleStruct.XsdUnionStruct struct) {
        JavaType type = parseType(struct.type(), false);
        List<JavaType> types = struct.types()
                .stream()
                .map(value -> parseType(value, false))
                .toList();

        return new JavaUnion(type, types);
    }

    private JavaClass parseComplex(XsdComplexStruct struct) {
        JavaType type = parseType(struct.type(), false);
        boolean isSequence = true;

        List<XsdValue> values = struct.values();

        if (values.size() == 1) {
            XsdValue value = values.getFirst();

            if (value instanceof XsdGroupValue group && group.kind() == XsdGroupValue.Kind.UNION) {
                isSequence = false;
                values = group.values();
            }
        }

        List<JavaClass> inners = new ArrayList<>();
        List<JavaField> fields = new ArrayList<>();

        outer.push(type.name());
        values.forEach(value -> parseValue(struct.type().scope(), value, inners, fields));
        outer.pop();

        return isSequence
                ? new JavaSequence(type, inners, fields)
                : new JavaChoice(type, inners, fields);
    }

    private void parseValue(String scope, XsdValue value, List<JavaClass> inners, List<JavaField> fields) {
        switch (value) {
            case XsdElementValue casted -> parseElement(casted, inners, fields);
            case XsdGroupValue casted -> parseGroup(scope, casted, inners, fields);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private void parseElement(XsdElementValue value, List<JavaClass> inners, List<JavaField> fields) {
        JavaType type = parseType(value.type(), List.of(), value.maxOccurs() > 1);
        JavaName name = new JavaName(value.name());
        XsdStruct struct = value.struct();

        if (struct != null) {
            type = parseType(value.type(), value.maxOccurs() > 1);
            inners.add(parse(struct));
        }

        fields.add(new JavaField(type, name));
    }

    private void parseGroup(String scope, XsdGroupValue value, List<JavaClass> inners, List<JavaField> fields) {
        if (value.kind() == XsdGroupValue.Kind.UNION || value.maxOccurs() > 1) {
            String name = parseGroupName(value);

            XsdType xsdType = new XsdType(scope, name, null, null);
            XsdComplexStruct xsdStruct = new XsdComplexStruct(xsdType, value.values());

            JavaComplex inner = (JavaComplex) parse(xsdStruct);
            JavaType type = inner.type();

            inner = value.kind() == XsdGroupValue.Kind.SEQUENCE
                    ? new JavaSequence(inner.type(), inner.inners(), inner.fields())
                    : new JavaChoice(inner.type(), inner.inners(), inner.fields());
            type = new JavaType(type.pkg(), type.outer(), type.name(), value.maxOccurs() > 1);

            javaScope.declare(inner);

            inners.add(inner);
            fields.add(new JavaField(type, new JavaName(name)));
        } else {
            value.values().forEach(val -> parseValue(scope, val, inners, fields));
        }
    }

    private JavaType parseType(XsdType type, boolean isList) {
        return parseType(type, getOuter(), isList);
    }

    private JavaType parseType(XsdType type, List<JavaName> outer, boolean isList) {
        return new JavaType(toPackage(type.scope()), outer, new JavaName(type.name()), isList);
    }

    private JavaType parseParent(XsdType type) {
        // TODO: figure out if the empty outer part causes problems as the parent might also be located inside an outer class
        return new JavaType(toPackage(type.parentScope()), List.of(), new JavaName(type.parentName()), false);
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

    private List<String> toPackage(String scope) {
        if (scope == null) {
            return config.basePkg;
        }

        try {
            URL url = URI.create(scope).toURL();
            String[] parts = url.getPath().split("/");

            List<String> result = new ArrayList<>(config.basePkg);
            result.addAll(Arrays.stream(parts)
                    .filter(part -> !part.matches("\\d+") && !"".equals(config.pkgConverter.get(part)))
                    .map(part -> {
                        String converted = config.pkgConverter.get(part);
                        return converted != null
                                ? converted
                                : part;
                    })
                    .filter(part -> !part.isEmpty())
                    .toList());

            return result;
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<JavaName> getOuter() {
        return List.copyOf(outer);
    }
}
