package io.github.pabulaner.jxsd.input.value_old;

import io.github.pabulaner.jxsd.input.type.ValueType;

public class Value {

    private final ValueType type;

    protected Value(ValueType type) {
        this.type = type;
    }

    public ValueType getType() {
        return type;
    }
}
