package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaModel;
import io.github.pabulaner.jxsd.api.java.IJavaName;
import io.github.pabulaner.jxsd.api.java.IJavaType;
import io.github.pabulaner.jxsd.api.java.IJavaValidator;
import io.github.pabulaner.jxsd.api.xsd.IXsdComplexType;
import io.github.pabulaner.jxsd.api.xsd.IXsdElementValue;
import io.github.pabulaner.jxsd.api.xsd.IXsdGroupValue;
import io.github.pabulaner.jxsd.api.xsd.IXsdModel;
import io.github.pabulaner.jxsd.api.xsd.IXsdSimpleType;
import io.github.pabulaner.jxsd.api.xsd.IXsdType;
import io.github.pabulaner.jxsd.api.xsd.IXsdValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaParser {

    private static final IJavaName VALUE_NAME = new JavaNameImpl("value");

    private static final String ENUMERATION = "enumeration";

    private static final int GROUP_NAME_COUNT = 3;

    private static final String GROUP_SEQUENCE_SEPARATOR = "and";

    private static final String GROUP_CHOICE_SEPARATOR = "or";

    public List<IJavaModel> parse(List<IXsdModel> xsd) {
        return xsd.stream()
                .map(this::parseModel)
                .toList();
    }

    private IJavaModel parseModel(IXsdModel xsd) {
        if (xsd instanceof IXsdSimpleType.IXsdPrimitiveType primitive) {
            return parsePrimitive(primitive);
        }

        if (xsd instanceof IXsdSimpleType.IXsdRestrictionType restriction) {
            return parseRestriction(restriction);
        }

        if (xsd instanceof IXsdSimpleType.IXsdListType list) {
            return parseList(list);
        }

        if (xsd instanceof IXsdSimpleType.IXsdUnionType union) {
            return parseUnion(union);
        }

        if (xsd instanceof IXsdComplexType complex) {
            return parseComplex(complex);
        }

        return null;
    }

    private IJavaModel parsePrimitive(IXsdSimpleType.IXsdPrimitiveType xsd) {
        String name = switch (xsd.type().name()) {
            case "string", "NOTATION", "QName", "anyURI" -> "String";
            case "boolean" -> "Boolean";
            case "float" -> "Float";
            case "double" -> "Double";
            case "decimal" -> "Long";
            case "duration" -> "java.time.Duration";
            case "dateTime" -> "java.time.LocalDateTime";
            case "time" -> "java.time.LocalTime";
            case "date" -> "java.time.LocalDate";
            case "gYearMonth", "gMonth", "gDay", "gMonthDay", "gYear" -> "Integer";
            case "hexBinary", "base64Binary" -> "byte[]";
            default -> null;
        };

        if (name == null) {
            return null;
        }

        IJavaType type = parseType(xsd.type(), IJavaType.Kind.OBJECT);
        IJavaType value = new JavaTypeImpl(new JavaNameImpl(name), null, IJavaType.Kind.OBJECT);
        IJavaField field = new JavaFieldImpl(value, VALUE_NAME, null, new ArrayList<>());

        return new JavaClassImpl(type, Collections.singletonList(field), new ArrayList<>());
    }

    private IJavaModel parseRestriction(IXsdSimpleType.IXsdRestrictionType xsd) {
        List<String> enumValues = new ArrayList<>();
        List<IJavaValidator> validators = new ArrayList<>();

        xsd.restrictions().forEach(restriction -> {
            if (ENUMERATION.equals(restriction.name())) {
                enumValues.add(restriction.name());
            } else {
                validators.add(new JavaValidatorImpl(restriction.name(), restriction.value()));
            }
        });

        IJavaType type = parseType(xsd.type(), enumValues.isEmpty()
                ? IJavaType.Kind.OBJECT
                : IJavaType.Kind.RESTRICTION);

        if (enumValues.isEmpty()) {
            IJavaField field = new JavaFieldImpl(null, VALUE_NAME, null, validators);
            return new JavaClassImpl(type, Collections.singletonList(field), new ArrayList<>());
        } else {
            return new JavaEnumImpl(type, enumValues);
        }
    }

    private IJavaModel parseList(IXsdSimpleType.IXsdListType xsd) {
        IJavaType type = new JavaTypeImpl(new JavaNameImpl(xsd.type().name()), new JavaNameImpl(xsd.itemType().name()), IJavaType.Kind.LIST);
        return new JavaClassImpl(type, new ArrayList<>(), new ArrayList<>());
    }

    private IJavaModel parseUnion(IXsdSimpleType.IXsdUnionType xsd) {
        IJavaType type = parseType(xsd.type(), IJavaType.Kind.UNION);
        List<IJavaField> fields = xsd.types()
                .stream()
                .map(value -> {
                    IJavaType valueType = parseType(value, IJavaType.Kind.OBJECT);
                    return (IJavaField) new JavaFieldImpl(valueType, null, null, new ArrayList<>());
                })
                .toList();

        return new JavaClassImpl(type, fields, new ArrayList<>());
    }

    private IJavaClass parseComplex(IXsdComplexType xsd) {
        IJavaType type = parseType(xsd.type(), IJavaType.Kind.OBJECT);

        List<IJavaField> fields = new ArrayList<>();
        List<IJavaModel> inners = new ArrayList<>();

        xsd.values().forEach(value -> parseValue(value, fields, inners));
        return new JavaClassImpl(type, fields, inners);
    }

    private void parseValue(IXsdValue value, List<IJavaField> fields, List<IJavaModel> inners) {
        if (value instanceof IXsdElementValue element) {
            fields.add(parseElement(element));
        }

        if (value instanceof IXsdGroupValue group) {
            parseGroup(group, fields, inners);
        }
    }

    private IJavaField parseElement(IXsdElementValue xsd) {
        IJavaType type = parseType(xsd.type(), xsd.maxOccurs() > 1
                ? IJavaType.Kind.LIST
                : IJavaType.Kind.OBJECT);

        return new JavaFieldImpl(type, new JavaNameImpl(xsd.name()), xsd.value(), new ArrayList<>());
    }

    private void parseGroup(IXsdGroupValue group, List<IJavaField> fields, List<IJavaModel> inners) {
        List<IXsdValue> values = group.values();

        List<IJavaField> groupFields = new ArrayList<>();
        List<IJavaModel> groupInners = new ArrayList<>();

        values.forEach(value -> parseValue(value, groupFields, groupInners));

        if (group.maxOccurs() > 1) {
            IJavaName name = new JavaNameImpl("");
            String separator = group.kind() == IXsdGroupValue.Kind.SEQUENCE
                    ? GROUP_SEQUENCE_SEPARATOR
                    : GROUP_CHOICE_SEPARATOR;

            for (int i = 0; i < GROUP_NAME_COUNT && i < groupFields.size(); i++) {
                if (!name.raw().isEmpty()) {
                    name = name.withSuffix(separator);
                }

                name = name.withSuffix(groupFields.get(i).name().raw());
            }

            IJavaType type = new JavaTypeImpl(name, null, IJavaType.Kind.OBJECT);

            fields.add(new JavaFieldImpl(type, name, null, new ArrayList<>()));
            inners.add(new JavaClassImpl(type, groupFields, groupInners));
        } else {
            fields.addAll(groupFields);
            inners.addAll(groupInners);
        }
    }

    private IJavaType parseType(IXsdType xsd, IJavaType.Kind kind) {
        return new JavaTypeImpl(new JavaNameImpl(xsd.name()), new JavaNameImpl(xsd.parent()), kind);
    }
}
