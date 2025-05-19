package io.github.pabulaner.jxsd.parser.model;

/**
 * A class used to represent a name or a reference to a class.
 */
public class Name {

    /**
     * The value of the name.
     */
    private final String value;

    public Name(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
