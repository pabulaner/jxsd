package io.github.pabulaner.jxsd.impl.xsd;

import java.util.HashMap;
import java.util.Map;

public class XsdScope {

    private final Map<String, XsdType> types;

    public XsdScope() {
        types = new HashMap<>();
    }

    public XsdType declare(String name, String parent) {
        return types.computeIfAbsent(name, key -> new XsdType(name, parent));
    }

    public XsdType getTopParent(XsdType type) {
        if (type.name().equals("ST_Percentage")) {
            System.out.println(type);
        }
        XsdType result = type;

        while (result.parent() != null
                && !XsdParser.SIMPLE_TYPE.equals(result.parent())
                && !XsdParser.ANY_SIMPLE_TYPE.equals(result.parent())
        ) {
            result = types.get(result.parent());
        }

        return result;
    }
}
