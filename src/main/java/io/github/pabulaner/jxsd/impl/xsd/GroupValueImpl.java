package io.github.pabulaner.jxsd.impl.xsd;

import io.github.pabulaner.jxsd.api.xsd.IGroupValue;
import io.github.pabulaner.jxsd.api.xsd.IValue;

import java.util.List;

public record GroupValueImpl(int minOccurs, int maxOccurs, IGroupValue.Kind kind, List<IValue> values) implements IGroupValue {
}
