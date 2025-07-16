package io.github.pabulaner.jxsd.out.resolver;

public record Name(String name) {

    public String toVar() {
        String value = toLower();

        return switch (value) {
            case "byte", "short", "int", "long", "float", "double", "boolean", "char", "if", "else", "for" -> "_" + value;
            default -> value;
        };
    }

    public String toLower() {
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }

    public String toUpper() {
        return name.substring(0, 1).toUpperCase() + name.substring(1);
    }
}
