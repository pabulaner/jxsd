package io.github.pabulaner.jxsd.impl.xsd;

import io.github.pabulaner.jxsd.api.xsd.IXsdElementValue;
import io.github.pabulaner.jxsd.api.xsd.IXsdType;

public record XsdElementValueImpl(int minOccurs, int maxOccurs, IXsdType type, String name, String value) implements IXsdElementValue {
}
