package io.github.pabulaner.jxsd.parser.model;

/**
 * A class that is used as a base for representing Java classes and other constructs.
 */
public abstract class Model {

    /**
     * The name of the model.
     */
    private final Name name;

    protected Model(Name name) {
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
