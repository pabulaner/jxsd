package io.github.pabulaner.jxsd.java;

import java.util.List;

public class JavaRestriction extends JavaClass {

    private JavaType parent;

    private JavaType primitive;

    private List<String> restrictions;

    public JavaRestriction(JavaType type, JavaType parent, JavaType primitive, List<String> restrictions) {
        super(type);

        this.parent = parent;
        this.primitive = primitive;
        this.restrictions = restrictions;
    }

    public JavaType getParent() {
        return parent;
    }

    public void setParent(JavaType parent) {
        this.parent = parent;
    }

    public JavaType getPrimitive() {
        return primitive;
    }

    public void setPrimitive(JavaType primitive) {
        this.primitive = primitive;
    }

    public List<String> getRestrictions() {
        return restrictions;
    }

    public void setRestrictions(List<String> restrictions) {
        this.restrictions = restrictions;
    }
}
