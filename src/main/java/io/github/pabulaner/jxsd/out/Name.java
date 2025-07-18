package io.github.pabulaner.jxsd.out;

public record Name(String name) {

    public String toVar() {
        String value = toLower();

        return switch (value) {
            case "byte", "short", "int", "long", "float", "double", "boolean", "char", "if", "else", "for" -> "_" + value;
            default -> value;
        };
    }

    public String toEnum() {
        String value = name;

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

    public String toLower() {
        return name.substring(0, 1).toLowerCase() + name.substring(1);
    }

    public String toUpper() {
        StringBuilder value = new StringBuilder(name.substring(0, 1).toUpperCase() + name.substring(1));
        boolean wasNumber = false;

        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);

            if (wasNumber) {
                value.setCharAt(i, Character.toUpperCase(c));
            }

            wasNumber = Character.isDigit(c);
        }

        return value.toString();
    }
}
