package io.github.pabulaner.jxsd.java;

public class JavaList extends JavaClass {

    private JavaType itemType;

    public JavaList(JavaType type, JavaType itemType) {
        super(type);
        this.itemType = itemType;
    }

    public JavaType getItemType() {
        return itemType;
    }

    public void setItemType(JavaType itemType) {
        this.itemType = itemType;
    }
}
