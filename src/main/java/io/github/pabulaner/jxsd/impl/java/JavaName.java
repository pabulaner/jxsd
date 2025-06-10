package io.github.pabulaner.jxsd.impl.java;

public record JavaName(String base, String part) {

    public String valid() {
        String clean = clean().valid();

        return switch (clean) {
            case "byte", "short", "int", "long", "float", "double", "boolean", "char", "if", "else", "for" -> "_" + clean;
            default -> clean;
        };
    }

    public JavaName lower() {
        String clean = clean().part();

        return new JavaName(base(), clean.isEmpty()
                ? clean
                : clean.substring(0, 1).toLowerCase() + clean.substring(1));
    }

    public JavaName upper() {
        String clean = clean().part();

        return new JavaName(base(), clean.isEmpty()
                ? clean
                : clean.substring(0, 1).toUpperCase() + clean.substring(1));
    }

    public JavaName clean() {
        int index = part.indexOf("_");

        return new JavaName(base(), index < 0
                ? part
                : part.substring(index + 1));
    }

    public JavaName withPrefix(String prefix) {
        return new JavaName(base, prefix + upper());
    }

    public JavaName withSuffix(String suffix) {
        JavaName other = new JavaName(null, suffix);
        return new JavaName(base, part + other.upper().part);
    }
}
