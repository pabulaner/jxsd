package io.github.pabulaner.jxsd.transform;

import org.docx4j.vml.root.Xml;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XmlObject {

    private final Map<String, Object> data;

    public XmlObject(Map<String, Object> data) {
        this.data = data != null
                ? data
                : new HashMap<>();
    }

    public String getString(String name) {
        return (String) data.get(name);
    }

    @SuppressWarnings("unchecked")
    public XmlObject getObject(String name) {
        return new XmlObject((Map<String, Object>) data.get(name));
    }

    @SuppressWarnings("unchecked")
    public XmlList getList(String name) {
        Object list = data.get(name);

        if (list == null) {
            return new XmlList(List.of());
        } else if (list instanceof List) {
            return new XmlList((List<Object>) list);
        } else {
            return new XmlList(List.of(list));
        }
    }
}
