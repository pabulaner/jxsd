package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

public final class InterfaceTransform {

    private final String name;

    private final List<MethodTransform> methods;

    public InterfaceTransform(
            @JacksonXmlProperty(localName = "name")
            String name,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "method")
            List<MethodTransform> methods
    ) {
        this.name = name;
        this.methods = methods != null ? methods : List.of();
    }

    public String getName() {
        return name;
    }

    public List<MethodTransform> getMethods() {
        return methods;
    }
}
