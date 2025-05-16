package io.github.pabulaner.jxsd.input.type;

public class Restriction {

    public enum Kind {

        ENUM,
        FRACTION_DIGITS,
        LENGTH,
        MAX_EXCLUSIVE,
        MAX_INCLUSIVE,
        MAX_LENGTH,
        MIN_EXCLUSIVE,
        MIN_INCLUSIVE,
        MIN_LENGTH,
        PATTERN,
        WHITE_SPACE,
    }

    private final Kind kind;

    private final String value;

    public Restriction(Kind kind, String value) {
        this.kind = kind;
        this.value = value;
    }

    public Kind getKind() {
        return kind;
    }

    public String getValue() {
        return value;
    }
}
