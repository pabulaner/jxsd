package io.github.pabulaner.jxsd.input.value;

public abstract class Value {

    public enum Kind {

        SINGLE,
        GROUP,
    }

    private final Kind kind;

    private final int minOccurs;

    private final int maxOccurs;

    protected Value(Kind kind, int minOccurs, int maxOccurs) {
        this.kind = kind;
        this.minOccurs = minOccurs;
        this.maxOccurs = maxOccurs;
    }

    public Kind getKind() {
        return kind;
    }

    public int getMinOccurs() {
        return minOccurs;
    }

    public int getMaxOccurs() {
        return maxOccurs;
    }
}
