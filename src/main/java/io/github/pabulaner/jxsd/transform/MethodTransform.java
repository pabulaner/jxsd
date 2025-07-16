package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

/**
 * Defines a method inside an interface.
 */
public class MethodTransform {

    /**
     * The name of the method.
     */
    private final String name;

    /**
     * The pkg of the type.
     */
    private final String pkg;

    /**
     * The type of the method. This type can either refer to the return type or the parameter type.
     */
    private final String type;

    /**
     * If true, the type is actually '? extends type'.
     */
    private final boolean wildcard;

    /**
     * If true, the type is wrapped in a list.
     */
    private final boolean list;

    public MethodTransform(
            @JacksonXmlProperty(localName = "name")
            String name,
            @JacksonXmlProperty(localName = "pkg")
            String pkg,
            @JacksonXmlProperty(localName = "type")
            String type,
            @JacksonXmlProperty(localName = "wildcard")
            boolean wildcard,
            @JacksonXmlProperty(localName = "list")
            boolean list
    ) {
        this.name = name;
        this.pkg = pkg;
        this.type = type;
        this.wildcard = wildcard;
        this.list = list;
    }

    public String getName() {
        return name;
    }

    public String getPkg() {
        return pkg;
    }

    public String getType() {
        return type;
    }

    public boolean isWildcard() {
        return wildcard;
    }

    public boolean isList() {
        return list;
    }
}
