package io.github.pabulaner.jxsd.transform;

import java.util.List;
import java.util.Map;

public class XmlList {

    private final List<Object> data;

    public XmlList(List<Object> data) {
        this.data = data != null
                ? data
                : List.of();
    }

    public int size() {
        return data.size();
    }

    public String getString(int index) {
        return (String) data.get(index);
    }

    @SuppressWarnings("unchecked")
    public XmlObject getObject(int index) {
        return new XmlObject((Map<String, Object>) data.get(index));
    }

    @SuppressWarnings("unchecked")
    public XmlList getList(int index) {
        Object list = data.get(index);

        if (list instanceof List) {
            return new XmlList((List<Object>) list);
        } else {
            return new XmlList(List.of(list));
        }
    }
}
