package io.github.pabulaner.jxsd.node;

public abstract class Node {

    public enum Type {

        NAME,
        SIMPLE,
        COMPLEX,
    }

    private final Type type;

    protected Node(Type type) {
        this.type = type;
    }

    public boolean isType(Type type) {
        return this.type == type;
    }
}
