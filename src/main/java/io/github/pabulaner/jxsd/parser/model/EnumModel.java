package io.github.pabulaner.jxsd.parser.model;

import java.util.Collection;

/**
 * A class that represents a Java enum.
 */
public class EnumModel extends Model {

    /**
     * The values of the enum.
     */
    private final Collection<Name> values;

    public EnumModel(Name name, Collection<Name> values) {
        super(name);
        this.values = values;
    }

    public Collection<Name> getValues() {
        return values;
    }
}
