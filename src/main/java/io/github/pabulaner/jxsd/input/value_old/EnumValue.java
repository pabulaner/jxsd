package io.github.pabulaner.jxsd.input.value_old;

import io.github.pabulaner.jxsd.input.type.ValueType;

import java.util.List;

public class EnumValue extends Value {

    private final List<String> values;

    protected EnumValue(ValueType type, List<String> values) {
        super(type);
        this.values = values;
    }

    public List<String> getValues() {
        return values;
    }
}
