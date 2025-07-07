package io.github.pabulaner.jxsd.java;

import java.util.ArrayList;
import java.util.List;

public abstract class JavaClass {

    private JavaType type;

    private List<JavaType> interfaces;

    public JavaClass(JavaType type) {
        this.type = type;
        this.interfaces = new ArrayList<>();
    }

    public JavaType getType() {
        return type;
    }

    public void setType(JavaType type) {
        this.type = type;
    }

    public List<JavaType> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(List<JavaType> interfaces) {
        this.interfaces = interfaces;
    }
}
