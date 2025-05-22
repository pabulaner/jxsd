package io.github.pabulaner.jxsd.impl.xsd;

import io.github.pabulaner.jxsd.api.xsd.IXsdGroupValue;
import io.github.pabulaner.jxsd.api.xsd.IXsdValue;

import java.util.List;

public record XsdGroupValueImpl(int minOccurs, int maxOccurs, IXsdGroupValue.Kind kind, List<IXsdValue> values) implements IXsdGroupValue {
}
