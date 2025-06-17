package io.github.pabulaner.jxsd.java;

public record JavaType(String pkg, String name, String parentPkg, String parentName, boolean isList) {

    public static JavaType createPrimitive(String primitive) {
        String name = switch (primitive) {
            case "string", "NOTATION", "QName", "anyURI", "IDREFS" -> "String";
            case "boolean" -> "Boolean";
            case "float" -> "Float";
            case "double" -> "Double";
            case "decimal" -> "Long";
            case "duration" -> "Duration";
            case "dateTime" -> "LocalDateTime";
            case "time" -> "LocalTime";
            case "date" -> "LocalDate";
            case "gYearMonth", "gMonth", "gDay", "gMonthDay", "gYear" -> "Integer";
            case "hexBinary", "base64Binary" -> "byte[]";
            default -> throw new IllegalArgumentException("Unexpected value: " + primitive);
        };

        String pkg = switch (primitive) {
            case "duration", "dateTime", "time", "date" -> "java.time";
            default -> null;
        };

        return new JavaType(pkg, name, null, null, false);
    }

    public String toModel() {
        return toModel(false);
    }

    public String toModel(boolean parent) {
        return toUpper(parent) + "Model";
    }

    public String toVar() {
        return toVar(false);
    }

    public String toVar(boolean parent) {
        String value = toLower(parent);

        return switch (value) {
            case "byte", "short", "int", "long", "float", "double", "boolean", "char", "if", "else", "for" -> "_" + value;
            default -> value;
        };
    }

    public String toLower() {
        return toLower(false);
    }

    public String toLower(boolean parent) {
        String value = parent ? parentName : name;
        return value.substring(0, 1).toLowerCase() + value.substring(1);
    }

    public String toUpper() {
        return toUpper(false);
    }

    public String toUpper(boolean parent) {
        String value = parent ? parentName : name;
        return value.substring(0, 1).toUpperCase() + value.substring(1);
    }
}
