package io.github.pabulaner.jxsd.java;

import java.util.List;

public final class JavaList extends JavaClass {

    private final JavaType itemType;

    private JavaList(JavaType type, List<JavaType> interfaces, JavaType itemType) {
        super(type, interfaces);
        this.itemType = itemType;
    }

    @Override
    public Builder<?, ?> builder() {
        return null;
    }

    public JavaType itemType() {
        return itemType;
    }
}
