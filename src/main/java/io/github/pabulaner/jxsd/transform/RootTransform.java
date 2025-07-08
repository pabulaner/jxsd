package io.github.pabulaner.jxsd.transform;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "transforms")
public final class RootTransform extends ClassTransform {

    private final List<String> pkg;

    public RootTransform(
            @JacksonXmlProperty(localName = "pkg")
            String pkg,
            @JacksonXmlElementWrapper(useWrapping = false)
            @JacksonXmlProperty(localName = "interface")
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
        super(null, interfaces, classes, replaces, renames);
        this.pkg = List.of(pkg.split("\\."));
    }

    public List<String> getPkg() {
        return pkg;
    }
}
