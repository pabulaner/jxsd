package io.github.pabulaner.jxsd.java;

public class JavaPrimitive extends JavaClass {

    private JavaType primitive;

    public JavaPrimitive(JavaType type, JavaType primitive) {
        super(type);
        this.primitive = primitive;
    }

    public JavaType getPrimitive() {
        return primitive;
    }

    public void setPrimitive(JavaType primitive) {
        this.primitive = primitive;
    }
}
