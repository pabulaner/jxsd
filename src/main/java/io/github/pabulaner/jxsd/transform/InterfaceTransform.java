package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.List;

/**
 * Defines a interface declaration.
 */
public final class InterfaceTransform extends TypeTransform {

    /**
     * The methods the interface defines.
     */
    private final List<MethodTransform> methods;

    public InterfaceTransform(
            @JacksonXmlProperty(localName = "name")
            String name,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "generic")
            List<GenericTransform> generics,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "extends")
            List<InterfaceTransform> interfaces,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "method")
            List<MethodTransform> methods
    ) {
        super(name, generics, interfaces);
        this.methods = methods != null ? methods : List.of();
    }

    public List<MethodTransform> getMethods() {
        return methods;
    }
}
