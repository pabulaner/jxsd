package io.github.pabulaner.jxsd.input.type;

public abstract class ValueType {

    public enum Kind {

        PRIMITIVE,
        RESTRICTION,
        LIST,
        UNION,
        OBJECT,
    }

    private final Kind kind;

    private final String name;

    private final ValueType base;

    protected ValueType(Kind kind, String name, ValueType base) {
        this.kind = kind;
        this.name = name;
        this.base = base;
    }

    public Kind getKind() {
        return kind;
    }

    public String getName() {
        return name;
    }

    public ValueType getBase() {
        return base;
    }
}
