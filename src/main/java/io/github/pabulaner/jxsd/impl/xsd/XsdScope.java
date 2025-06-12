package io.github.pabulaner.jxsd.impl.xsd;

import java.util.HashMap;
import java.util.Map;

public class XsdScope {

    private final Map<String, Map<String, XsdType>> types;

    public XsdScope() {
        types = new HashMap<>();
    }

    public XsdType declare(String scope, String name, String parentScope, String parentName) {
        return types
                .computeIfAbsent(scope, key -> new HashMap<>())
                .computeIfAbsent(name, key -> new XsdType(scope, name, parentScope, parentName));
    }

    public XsdType getTopParent(XsdType type) {
        XsdType result = type;

        while (!XsdParser.SIMPLE_TYPE.equals(result.parentName()) && !XsdParser.ANY_SIMPLE_TYPE.equals(result.parentName())) {
            result = types.get(result.parentScope()).get(result.parentName());
        }

        return result;
    }
}
