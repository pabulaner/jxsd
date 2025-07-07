package io.github.pabulaner.jxsd.java;

import java.util.List;

public class JavaUnion extends JavaClass {

    private List<JavaType> types;

    public JavaUnion(JavaType type, List<JavaType> types) {
        super(type);
        this.types = types;
    }

    public List<JavaType> getTypes() {
        return types;
    }

    public void setTypes(List<JavaType> types) {
        this.types = types;
    }
}
