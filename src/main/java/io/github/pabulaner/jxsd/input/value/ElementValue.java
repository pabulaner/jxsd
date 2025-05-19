package io.github.pabulaner.jxsd.input.value;

import io.github.pabulaner.jxsd.input.type.ValueType;

import java.math.BigInteger;

public class ElementValue extends Value {

    private final ValueType type;

    private final String name;

    public ElementValue(BigInteger minOccurs, BigInteger maxOccurs, ValueType type, String name) {
        super(Kind.SINGLE, minOccurs, maxOccurs);

        this.type = type;
        this.name = name;
    }

    public ValueType getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
