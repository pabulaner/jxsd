package io.github.pabulaner.jxsd.impl.xsd;

import java.util.HashMap;
import java.util.Map;

public class XsdScope {

    private static final String SIMPLE_TYPE = "simpleType";

    private static final String ANY_SIMPLE_TYPE = "anySimpleType";

    private final Map<String, XsdType> types;

    public XsdScope() {
        types = new HashMap<>();
    }

    XsdType declare(String name, String parent) {
        return types.computeIfAbsent(name, key -> new XsdType(name, parent));
    }

    String getTopParent(XsdType type) {
        XsdType result = type;

        while (!SIMPLE_TYPE.equals(result.parent()) && !ANY_SIMPLE_TYPE.equals(result.parent())) {
            result = types.get(result.parent());
        }

        return result.name();
    }
}
