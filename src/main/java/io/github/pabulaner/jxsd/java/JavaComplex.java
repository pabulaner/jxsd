package io.github.pabulaner.jxsd.java;

import org.docx4j.convert.out.html.TagClass;

import java.util.List;

public abstract class JavaComplex extends JavaClass {

    private List<JavaClass> inners;

    private List<JavaField> fields;

    public JavaComplex(JavaType type, List<JavaClass> inners, List<JavaField> fields) {
        super(type);
        this.inners = inners;
        this.fields = fields;
    }

    public List<JavaClass> getInners() {
        return inners;
    }

    public void setInners(List<JavaClass> inners) {
        this.inners = inners;
    }

    public List<JavaField> getFields() {
        return fields;
    }

    public void setFields(List<JavaField> fields) {
        this.fields = fields;
    }
}
