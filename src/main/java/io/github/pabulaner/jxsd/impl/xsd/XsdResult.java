package io.github.pabulaner.jxsd.impl.xsd;

import io.github.pabulaner.jxsd.api.xsd.IXsdModel;
import io.github.pabulaner.jxsd.api.xsd.IXsdType;

import java.util.List;
import java.util.Map;

public record XsdResult(Map<String, IXsdType> types, List<IXsdModel> models) {

    private static final String SIMPLE_TYPE = "simpleType";

    private static final String ANY_SIMPLE_TYPE = "anySimpleType";

    public IXsdType getPrimitiveType(IXsdType type) {
        IXsdType result = type;

        while (!SIMPLE_TYPE.equals(result.parent()) && !ANY_SIMPLE_TYPE.equals(result.parent())) {
            result = types.get(result.parent());
        }

        return result;
    }
}
