package io.github.pabulaner.jxsd.java;

import java.util.List;
import java.util.Objects;

public record JavaType(List<String> pkg, List<String> outer, String name, boolean list) {

    public JavaType(List<String> pkg, String name) {
        this(pkg, name, false);
    }

    public JavaType(List<String> pkg, String name, boolean list) {
        this(pkg, List.of(), name, list);
    }

    public static JavaType createPrimitive(String primitive) {
        List<String> pkg = switch (primitive) {
            case "duration", "dateTime", "time", "date" -> List.of("java", "time");
            default -> List.of();
        };

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

        return new JavaType(pkg, List.of(), name, false);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != JavaType.class) {
            return false;
        }

        JavaType casted = (JavaType) obj;
        return Objects.equals(casted.pkg, pkg)
                && Objects.equals(casted.outer, outer)
                && Objects.equals(casted.name, name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pkg, outer, name);
    }
}
