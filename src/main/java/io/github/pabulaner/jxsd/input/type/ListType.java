package io.github.pabulaner.jxsd.input.type;

public class ListType extends ValueType {

    private final ValueType item;

    public ListType(String name, ValueType base, ValueType item) {
        super(Kind.LIST, name, base);
        this.item = item;
    }

    public ValueType getItem() {
        return item;
    }
}
