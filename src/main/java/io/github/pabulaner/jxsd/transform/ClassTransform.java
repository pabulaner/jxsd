package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Defines a class transform.
 */
public class ClassTransform extends TypeTransform {

    /**
     * The class transforms for inner classes.
     */
    private final Map<String, ClassTransform> classes;

    /**
     * The field types that should be replaced.
     */
    private final Map<String, RefactorTransform> replaces;

    /**
     * The field names that should be renamed.
     */
    private final Map<String, RefactorTransform> renames;

    public ClassTransform(
            @JacksonXmlProperty(localName = "name")
            String name,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "generic")
            List<GenericTransform> generics,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "implements")
            List<InterfaceTransform> interfaces,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "class")
            List<ClassTransform> classes,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "replace")
            List<RefactorTransform> replaces,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "rename")
            List<RefactorTransform> renames
    ) {
        super(name, generics, interfaces);

        this.classes = new HashMap<>();
        this.replaces = new HashMap<>();
        this.renames = new HashMap<>();

        if (classes != null) classes.forEach(value -> this.classes.put(value.getName(), value));
        if (replaces != null) replaces.forEach(value -> this.replaces.put(value.getValue(), value));
        if (renames != null) renames.forEach(value -> this.renames.put(value.getValue(), value));
    }

    public ClassTransform getClass(String key) {
        return classes.get(key);
    }

    public RefactorTransform getReplace(String key) {
        return replaces.get(key);
    }

    public RefactorTransform getRename(String key) {
        return renames.get(key);
    }
}
