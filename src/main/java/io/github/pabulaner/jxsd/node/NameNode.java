package io.github.pabulaner.jxsd.node;

public class NameNode extends Node {

    private final String value;

    public NameNode(String value) {
        super(Type.NAME);
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
