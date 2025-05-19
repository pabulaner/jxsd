package io.github.pabulaner.jxsd.impl.xsd;

import io.github.pabulaner.jxsd.api.xsd.IElementValue;
import io.github.pabulaner.jxsd.api.xsd.IType;

public record ElementValueImpl(int minOccurs, int maxOccurs, IType type, String name, String value) implements IElementValue {
}
