package io.github.pabulaner.jxsd.java;

import java.util.List;

public class JavaEnum extends JavaClass {

    private List<String> values;

    public JavaEnum(JavaType type, List<String> values) {
        super(type);
        this.values = values;
    }

    public List<String> getValues() {
        return values;
    }

    public void setValues(List<String> values) {
        this.values = values;
    }
}
