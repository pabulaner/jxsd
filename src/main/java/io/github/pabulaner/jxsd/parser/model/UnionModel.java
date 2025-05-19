package io.github.pabulaner.jxsd.parser.model;

import java.util.List;

/**
 * A class representing a union.
 */
public class UnionModel extends Model {

    /**
     * The types of the union.
     */
    private final List<Name> types;

    public UnionModel(Name name, List<Name> types) {
        super(name);
        this.types = types;
    }

    public List<Name> getTypes() {
        return types;
    }
}
