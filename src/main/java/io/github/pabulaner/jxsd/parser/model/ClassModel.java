package io.github.pabulaner.jxsd.parser.model;

import java.util.List;

/**
 * A class that represents a Java class.
 */
public class ClassModel {

    /**
     * The parent of the class.
     */
    private Name parent;

    /**
     * The inner classes of the class.
     */
    private List<Name> inners;

    /**
     * The fields of the class.
     */
    private List<FieldModel> fields;

    public ClassModel() {
    }

    public Name getParent() {
        return parent;
    }

    public ClassModel setParent(Name parent) {
        this.parent = parent;
        return this;
    }

    public List<Name> getInners() {
        return inners;
    }

    public void setInners(List<Name> inners) {
        this.inners = inners;
    }

    public List<FieldModel> getFields() {
        return fields;
    }

    public void setFields(List<FieldModel> fields) {
        this.fields = fields;
    }
}
