package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public class MethodTransform {

    private final String name;

    private final String pkg;

    private final String type;

    private final boolean wildcard;

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
