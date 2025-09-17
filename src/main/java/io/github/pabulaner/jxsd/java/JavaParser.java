package io.github.pabulaner.jxsd.java;

import io.github.pabulaner.jxsd.util.Name;
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
import java.util.Objects;
import java.util.Stack;

public class JavaParser {

    private XsdScope xsdScope;

    private JavaScope javaScope;

    private final Stack<String> outer;

    public JavaParser() {
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
        JavaType type = parseType(struct.type());
        return new JavaPrimitive.Builder()
                .setType(type)
                .build();
    }

    private JavaClass parseRestriction(XsdSimpleStruct.XsdRestrictionStruct struct) {
        JavaType type = parseType(struct.type());
        JavaType parent = parseParent(struct.type());
        JavaType primitive = parseType(xsdScope.getTopParent(struct.type()));

        List<String> enums = struct.restrictions()
                .stream()
                .filter(restriction -> "enumeration".equals(restriction.name()))
                .map(XsdRestriction::value)
                .toList();

        if (enums.isEmpty()) {
            return new JavaRestriction.Builder()
                    .setType(type)
                    .setParent(parent)
                    .setPrimitive(primitive)
                    .build();
        } else {
            return new JavaEnum.Builder()
                    .setType(type)
                    .setValues(enums)
                    .build();
        }
    }

    private JavaClass parseList(XsdSimpleStruct.XsdListStruct struct) {
        JavaType type = parseType(struct.type());
        JavaType itemType = parseType(struct.itemType());

        // TODO: add builder for lists
        return null;
    }

    private JavaClass parseUnion(XsdSimpleStruct.XsdUnionStruct struct) {
        JavaType type = parseType(struct.type());
        List<JavaType> types = struct.types()
                .stream()
                .map(this::parseType)
                .toList();

        return new JavaUnion.Builder()
                .setType(type)
                .setTypes(types)
                .build();
    }

    private JavaClass parseComplex(XsdComplexStruct struct) {
        JavaType type = parseType(struct.type());
        boolean isSequence = true;

        List<XsdValue> values = struct.values();

        if (values.size() == 1) {
            XsdValue value = values.getFirst();

            if (value.maxOccurs() <= 1 && value instanceof XsdGroupValue group && group.kind() == XsdGroupValue.Kind.UNION) {
                isSequence = false;
                values = group.values();
            }
        }

        List<JavaClass> inners = new ArrayList<>();
        List<JavaField> fields = new ArrayList<>();

        outer.push(type.getName());
        values.forEach(value -> parseValue(struct.type().scope(), value, inners, fields));
        outer.pop();

        JavaComplex.Builder<?, ?> builder = isSequence
                ? new JavaSequence.Builder()
                : new JavaChoice.Builder();



        return builder
                .setType(type)
                .setInners(inners)
                .setFields(fields)
                .build();
    }

    private void parseValue(String scope, XsdValue value, List<JavaClass> inners, List<JavaField> fields) {
        switch (value) {
            case XsdElementValue casted -> parseElement(casted, inners, fields);
            case XsdGroupValue casted -> parseGroup(scope, casted, inners, fields);
            default -> throw new IllegalStateException("Unexpected value: " + value);
        }
    }

    private void parseElement(XsdElementValue value, List<JavaClass> inners, List<JavaField> fields) {
        JavaType type = parseType(value.type(), List.of(), value.minOccurs(), value.maxOccurs());
        XsdStruct struct = value.struct();

        if (struct != null) {
            type = parseType(value.type(), value.minOccurs(), value.maxOccurs());
            inners.add(parse(struct));
        }

        fields.add(new JavaField.Builder()
                .setType(type)
                .setName(value.name())
                .setValue(value.value())
                .build());
    }

    private void parseGroup(String scope, XsdGroupValue value, List<JavaClass> inners, List<JavaField> fields) {
        if (value.kind() == XsdGroupValue.Kind.UNION || value.maxOccurs() > 1) {
            String name = parseGroupName(value);

            XsdType xsdType = new XsdType(scope, new Name(name).toUpper(), null, null);
            XsdComplexStruct xsdStruct = new XsdComplexStruct(xsdType, value.values());

            JavaComplex inner = (JavaComplex) parse(xsdStruct);
            JavaType type = inner.getType();

            JavaComplex.Builder<?, ?> builder = value.kind() == XsdGroupValue.Kind.SEQUENCE
                    ? new JavaSequence.Builder()
                    : new JavaChoice.Builder();

            inner = builder
                    .setType(inner.getType())
                    .setInners(inner.getInners())
                    .setFields(inner.getFields())
                    .build();

            type = new JavaType.Builder()
                    .setPkg(type.getPkg())
                    .setOuter(type.getOuter())
                    .setName(type.getName())
                    .setMinOccurs(value.minOccurs())
                    .setMaxOccurs(value.maxOccurs())
                    .build();

            javaScope.declare(inner);

            inners.add(inner);
            fields.add(new JavaField.Builder()
                    .setType(type)
                    .setName(name)
                    .build());
        } else {
            value.values().forEach(val -> parseValue(scope, val, inners, fields));
        }
    }

    private JavaType parseType(XsdType type) {
        return parseType(type, 1, 1);
    }

    private JavaType parseType(XsdType type, int minOccurs, int maxOccurs) {
        return parseType(type, getOuter(), minOccurs, maxOccurs);
    }

    private JavaType parseType(XsdType type, List<String> outer, int minOccurs, int maxOccurs) {
        return new JavaType.Builder()
                .setPkg(toPackage(type.scope()))
                .setOuter(outer)
                .setName(type.name())
                .setMinOccurs(minOccurs)
                .setMaxOccurs(maxOccurs).build();
    }

    private JavaType parseParent(XsdType type) {
        return new JavaType.Builder()
                .setPkg(toPackage(type.parentScope()))
                .setName(type.parentName())
                .build();
    }

    private String parseGroupName(XsdGroupValue value) {
        return parseGroupName(value, 3);
    }

    private String parseGroupName(XsdGroupValue value, int maxNameCount) {
        if (value.name() != null) {
            return value.name();
        }

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

            int index = name.indexOf("_");

            if (index >= 0) {
                name = name.substring(index + 1);
            }

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
        try {
            URL url = URI.create(scope).toURL();
            String[] parts = url.getPath()
                    .substring(1)
                    .split("/");

            return Arrays.asList(parts);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    private List<String> getOuter() {
        return new ArrayList<>(outer);
    }
}
