package io.github.pabulaner.jxsd.parser.model;

import java.util.Collection;

/**
 * A class that represents a Java class.
 */
public class ClassModel {

    /**
     * The parent of the class.
     */
    private final Name parent;

    /**
     * The inner classes of the class.
     */
    private final Collection<Name> inners;

    /**
     * The fields of the class.
     */
    private final Collection<FieldModel> fields;

    public ClassModel(Name parent, Collection<Name> inners, Collection<FieldModel> fields) {
        this.parent = parent;
        this.inners = inners;
        this.fields = fields;
    }

    public Name getParent() {
        return parent;
    }

    public Collection<Name> getInners() {
        return inners;
    }

    public Collection<FieldModel> getFields() {
        return fields;
    }
}
