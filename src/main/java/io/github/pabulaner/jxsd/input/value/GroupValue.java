package io.github.pabulaner.jxsd.input.value;

import java.util.List;

public class GroupValue extends Value {

    public enum Compositor {

        SEQUENCE,
        CHOICE,
        ALL,
    }

    private final Compositor compositor;

    private final List<Value> children;

    public GroupValue(int minOccurs, int maxOccurs, Compositor compositor, List<Value> children) {
        super(Kind.GROUP, minOccurs, maxOccurs);
        this.compositor = compositor;
        this.children = children;
    }

    public Compositor getCompositor() {
        return compositor;
    }

    public List<Value> getChildren() {
        return children;
    }
}
