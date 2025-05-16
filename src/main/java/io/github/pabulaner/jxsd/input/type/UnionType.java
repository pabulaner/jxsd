package io.github.pabulaner.jxsd.input.type;

import java.util.List;

public class UnionType extends ValueType {

    private final List<ValueType> types;

    public UnionType(String name, ValueType base, List<ValueType> types) {
        super(Kind.UNION, name, base);
        this.types = types;
    }

    public List<ValueType> getTypes() {
        return types;
    }
}
