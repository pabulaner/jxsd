package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * Defines a interface declaration.
 */
public final class InterfaceTransform {

    /**
     * The name of the interface.
     */
    private final String name;

    /**
     * The super interfaces, if any.
     */
    private final List<InterfaceTransform> ext;

    /**
     * The methods the interface defines.
     */
    private final List<MethodTransform> methods;

    public InterfaceTransform(
            @JacksonXmlProperty(localName = "name")
            String name,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "extends")
            List<InterfaceTransform> ext,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "method")
            List<MethodTransform> methods
    ) {
        this.name = name;
        this.ext = ext != null ? ext : List.of();
        this.methods = methods != null ? methods : List.of();
    }

    public String getName() {
        return name;
    }

    public List<InterfaceTransform> getExt() {
        return ext;
    }

    public List<MethodTransform> getMethods() {
        return methods;
    }
}
