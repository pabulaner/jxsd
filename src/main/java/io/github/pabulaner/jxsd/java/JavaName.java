package io.github.pabulaner.jxsd.java;

public class JavaName {

    private String name;

    public JavaName(String name) {
        this.name = name;
    }

    public String toVar() {
        String value = toLower();

        return switch (value) {
            case "byte", "short", "int", "long", "float", "double", "boolean", "char", "if", "else", "for" -> "_" + value;
            default -> value;
        };
    }

    public String toModel() {
        return toModel(false);
    }

    public String toModel(boolean isList) {
        return clean("Model", isList);
    }

    public String toBuilder() {
        return toBuilder(false);
    }

    public String toBuilder(boolean isList) {
        return clean("Builder", isList);
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
