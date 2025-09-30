package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * The base class for type transforms like classes or interfaces.
 */
public abstract class TypeTransform {

    /**
     * The name of the target class.
     */
    private final String name;

    /**
     * The generics the class defines.
     */
    private final List<GenericTransform> generics;

    /**
     * The interfaces the class implements.
     */
    private final List<InterfaceTransform> interfaces;

    public TypeTransform(String name, List<GenericTransform> generics, List<InterfaceTransform> interfaces) {
        this.name = name;
        this.generics = generics != null ? generics : List.of();
        this.interfaces = interfaces != null ? interfaces : List.of();
    }

    public String getName() {
        return name;
    }

    public List<GenericTransform> getGenerics() {
        return generics;
    }

    public List<InterfaceTransform> getInterfaces() {
        return interfaces;
    }
}
