package io.github.pabulaner.jxsd.input.value;

import io.github.pabulaner.jxsd.input.type.ValueType;

public class AttributeValue extends ElementValue {

    private final String defaultValue;

    private final String fixedValue;

    public AttributeValue(ValueType type, String name, String defaultValue, String fixedValue) {
        super(null, null, type, name);

        this.defaultValue = defaultValue;
        this.fixedValue = fixedValue;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public String getFixedValue() {
        return fixedValue;
    }
}
