package io.github.pabulaner.jxsd.input.value_old;

import io.github.pabulaner.jxsd.input.type.ValueType;

import java.util.List;

public class ClassValue extends Value {

    private final List<FieldValue> fields;

    protected ClassValue(ValueType type, List<FieldValue> fields) {
        super(type);
        this.fields = fields;
    }

    public List<FieldValue> getFields() {
        return fields;
    }
}
