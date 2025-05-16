package io.github.pabulaner.jxsd.input;

import io.github.pabulaner.jxsd.input.type.ValueType;

import java.util.HashMap;
import java.util.Map;

public class Scope {

    private final Map<String, ValueType> types;

    public Scope() {
        types = new HashMap<>();
    }

    public void addType(ValueType type) {
        types.put(type.getName(), type);
    }

    public ValueType getType(String name) {
        return types.get(name);
    }
}
