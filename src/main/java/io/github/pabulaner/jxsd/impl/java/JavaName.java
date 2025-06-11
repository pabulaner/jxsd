package io.github.pabulaner.jxsd.impl.java;

public final class JavaName {

    private static final String CLASS_SUFFIX = "Model";

    private JavaName() {
        // empty
    }

    public static String removePrefix(String name) {
        int index = name.indexOf("_");

        return index < 0
                ? name
                : name.substring(index + 1);
    }

    public static String toPrimitive(String name) {
        return switch (name) {
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
            default -> throw new IllegalArgumentException("Unexpected value: " + name);
        };
    }

    public static String toClass(String name) {
        name = removePrefix(name);

        if (!name.isEmpty()) {
            name = name.substring(0, 1).toUpperCase() + name.substring(1);
        }

        return name + CLASS_SUFFIX;
    }

    public static String toVariable(String name) {
        name = removePrefix(name);

        if (!name.isEmpty()) {
            name = name.substring(0, 1).toLowerCase() + name.substring(1);
        }

        return switch (name) {
            case "byte", "short", "int", "long", "float", "double", "boolean", "char", "if", "else", "for" -> "_" + name;
            default -> name;
        };
    }
}
