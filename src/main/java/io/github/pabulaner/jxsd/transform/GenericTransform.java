package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Defines a generic transform.
 */
public class GenericTransform {

    /**
     * The package of the type of the generic. Only relevant if the generic is a type.
     */
    private final String pkg;

    /**
     * The name or type of the generic.
     */
    private final String name;

    /**
     * The lower bound (? super lowerBound) of the generic.
     */
    private final String lowerBound;

    /**
     * The upper bound (? extends upperBound) of the generic.
     */
    private final String upperBound;

    public GenericTransform(
            @JacksonXmlProperty(localName = "pkg")
            String pkg,
            @JacksonXmlProperty(localName = "name")
            String name,
            @JacksonXmlProperty(localName = "super")
            String lowerBound,
            @JacksonXmlProperty(localName = "extends")
            String upperBound
    ) {
        this.pkg = pkg;
        this.name = name;
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
    }

    public boolean isWildcard() {
        return "?".equals(name);
    }

    public String getPkg() {
        return pkg;
    }

    public String getName() {
        return name;
    }

    public String getLowerBound() {
        return lowerBound;
    }

    public String getUpperBound() {
        return upperBound;
    }
}
