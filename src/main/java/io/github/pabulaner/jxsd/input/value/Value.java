package io.github.pabulaner.jxsd.input.value;

import java.math.BigInteger;

public abstract class Value {

    public enum Kind {

        SINGLE,
        GROUP,
    }

    private final Kind kind;

    private final BigInteger minOccurs;

    private final BigInteger maxOccurs;

    protected Value(Kind kind, BigInteger minOccurs, BigInteger maxOccurs) {
        this.kind = kind;
        this.minOccurs = minOccurs;
        this.maxOccurs = maxOccurs;
    }

    public Kind getKind() {
        return kind;
    }

    public BigInteger getMinOccurs() {
        return minOccurs;
    }

    public BigInteger getMaxOccurs() {
        return maxOccurs;
    }
}
