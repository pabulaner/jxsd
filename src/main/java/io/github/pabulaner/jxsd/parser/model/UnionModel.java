package io.github.pabulaner.jxsd.parser.model;

import java.util.Collection;

/**
 * A class representing a union.
 */
public class UnionModel extends Model {

    /**
     * The types of the union.
     */
    private final Collection<Name> types;

    public UnionModel(Name name, Collection<Name> types) {
        super(name);
        this.types = types;
    }

    public Collection<Name> getTypes() {
        return types;
    }
}
