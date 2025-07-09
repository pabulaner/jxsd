package io.github.pabulaner.jxsd.java;

import java.util.List;
import java.util.Objects;

public class JavaType {

    private List<String> pkg;

    private List<JavaName> outer;

    private JavaName name;

    private boolean list;

    public JavaType(List<String> pkg, JavaName name) {
        this(pkg, name, false);
    }

    public JavaType(List<String> pkg, JavaName name, boolean list) {
        this(pkg, List.of(), name, list);
    }

    public JavaType(List<String> pkg, List<JavaName> outer, JavaName name, boolean list) {
        this.pkg = pkg;
        this.outer = outer;
        this.name = name;
        this.list = list;
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

        return new JavaType(pkg, List.of(), new JavaName(name), false);
    }

    public List<String> getPkg() {
        return pkg;
    }

    public void setPkg(List<String> pkg) {
        this.pkg = pkg;
    }

    public List<JavaName> getOuter() {
        return outer;
    }

    public void setOuter(List<JavaName> outer) {
        this.outer = outer;
    }

    public JavaName getName() {
        return name;
    }

    public void setName(JavaName name) {
        this.name = name;
    }

    public boolean isList() {
        return list;
    }

    public void setList(boolean list) {
        this.list = list;
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
