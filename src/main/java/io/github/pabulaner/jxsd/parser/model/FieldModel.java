package io.github.pabulaner.jxsd.parser.model;

/**
 * A class that represents a field of a Java class.
 */
public class FieldModel extends Model {

    /**
     * The type of the field.
     */
    private final Name type;

    /**
     * The default value of the field.
     */
    private final String value;

    public FieldModel(Name name, Name type, String value) {
        super(name);

        this.type = type;
        this.value = value;
    }
}
