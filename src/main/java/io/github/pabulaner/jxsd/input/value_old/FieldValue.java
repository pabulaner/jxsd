package io.github.pabulaner.jxsd.input.value_old;

import io.github.pabulaner.jxsd.input.type.ValueType;

public class FieldValue extends Value {

    private final String name;

    public FieldValue(ValueType type, String name) {
        super(type);
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
