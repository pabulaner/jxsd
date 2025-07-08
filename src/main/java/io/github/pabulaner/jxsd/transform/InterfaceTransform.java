package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

public final class InterfaceTransform {

    private final String name;

    public InterfaceTransform(
            @JacksonXmlProperty(localName = "name")
            String name
    ) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
