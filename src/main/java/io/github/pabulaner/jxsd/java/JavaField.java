package io.github.pabulaner.jxsd.java;

public class JavaField {

    private JavaType type;

    private JavaName name;

    public JavaField(JavaType type, JavaName name) {
        this.type = type;
        this.name = name;
    }

    public JavaType getType() {
        return type;
    }

    public void setType(JavaType type) {
        this.type = type;
    }

    public JavaName getName() {
        return name;
    }

    public void setName(JavaName name) {
        this.name = name;
    }
}
