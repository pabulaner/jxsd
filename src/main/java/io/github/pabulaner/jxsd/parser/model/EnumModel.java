package io.github.pabulaner.jxsd.parser.model;

import java.util.List;

/**
 * A class that represents a Java enum.
 */
public class EnumModel extends Model {

    /**
     * The values of the enum.
     */
    private final List<Name> values;

    public EnumModel(Name name, List<Name> values) {
        super(name);
        this.values = values;
    }

    public List<Name> getValues() {
        return values;
    }
}
