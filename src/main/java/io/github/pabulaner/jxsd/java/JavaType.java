package io.github.pabulaner.jxsd.java;

import java.util.List;
import java.util.Objects;

public record JavaType(List<String> pkg, List<String> outer, String name, boolean isList) {

    public static JavaType createPrimitive(String primitive) {
        String name = switch (primitive) {
            case "string", "NOTATION", "QName", "anyURI", "IDREFS" -> "String";
            case "boolean" -> "boolean";
            case "float" -> "float";
            case "double" -> "double";
            case "decimal" -> "long";
            case "duration" -> "Duration";
            case "dateTime" -> "LocalDateTime";
            case "time" -> "LocalTime";
            case "date" -> "LocalDate";
            case "gYearMonth", "gMonth", "gDay", "gMonthDay", "gYear" -> "int";
            case "hexBinary", "base64Binary" -> "byte[]";
            default -> throw new IllegalArgumentException("Unexpected value: " + primitive);
        };

        return new JavaType(null, null, name, false);
    }

    public String toVar() {
        String value = toLower();

        return switch (value) {
            case "byte", "short", "int", "long", "float", "double", "boolean", "char", "if", "else", "for" -> "_" + value;
            default -> value;
        };
    }

    public String toModel() {
        return clean("Model", isList);
    }

    public String toModelImport() {
        return clean("Model", false);
    }

    public String toBuilder() {
        return clean("Builder", isList);
    }

    public String toBuilderImport() {
        return clean("Builder", false);
    }

    public String toConverter() {
        return clean("Converter", false);
    }

    public String toConverterImport() {
        return toConverter();
    }

    public String toDocx4j() {
        return toUpper().replace("_", "");
    }

    public String toLower() {
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }

    public String toUpper() {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }

    public String clean(String suffix, boolean isList) {
        String value = toUpper().replace("_", "") + suffix;
        return isList ? "List<" + value + ">" : value;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj.getClass() != JavaType.class) {
            return false;
        }

        JavaType casted = (JavaType) obj;
        return Objects.equals(casted.pkg, pkg)
                && Objects.equals(casted.outer, outer)
                && Objects.equals(casted.name, name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkg, name);
    }
}
