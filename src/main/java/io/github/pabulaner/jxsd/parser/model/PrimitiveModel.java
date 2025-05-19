package io.github.pabulaner.jxsd.parser.model;

import java.util.List;

/**
 * A class that represents a primitive data type.
 */
public class PrimitiveModel extends Model {

    /**
     * The parent of the primitive.
     */
    private final Name parent;

    /**
     * The restrictions for the primitive.
     */
    private final List<RestrictionModel> restrictions;

    public PrimitiveModel(Name name, Name parent, List<RestrictionModel> restrictions) {
        super(name);

        this.parent = parent;
        this.restrictions = restrictions;
    }

    public Name getParent() {
        return parent;
    }

    public List<RestrictionModel> getRestrictions() {
        return restrictions;
    }
}
