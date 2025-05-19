package io.github.pabulaner.jxsd.parser.model;

/**
 * A class used to represent validators for primitive data types.
 */
public class RestrictionModel extends Model {

    /**
     * The value for the validator.
     */
    private final Name value;

    public RestrictionModel(Name name, Name value) {
        super(name);
        this.value = value;
    }

    public Name getValue() {
        return value;
    }
}
