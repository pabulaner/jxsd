package io.github.pabulaner.jxsd.input.type;

import io.github.pabulaner.jxsd.input.value.AttributeValue;
import io.github.pabulaner.jxsd.input.value.Value;

import java.util.List;

public class ObjectType extends ValueType {

    private final List<AttributeValue> attributes;

    private final Value value;

    public ObjectType(String name, ValueType base, List<AttributeValue> attributes, Value value) {
        super(Kind.OBJECT, name, base);

        this.attributes = attributes;
        this.value = value;
    }

    public List<AttributeValue> getAttributes() {
        return attributes;
    }

    public Value getValue() {
        return value;
    }
}
