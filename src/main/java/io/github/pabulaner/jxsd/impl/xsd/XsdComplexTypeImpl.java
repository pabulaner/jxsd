package io.github.pabulaner.jxsd.impl.xsd;

import io.github.pabulaner.jxsd.api.xsd.IXsdComplexType;
import io.github.pabulaner.jxsd.api.xsd.IXsdType;
import io.github.pabulaner.jxsd.api.xsd.IXsdValue;

import java.util.List;

public record XsdComplexTypeImpl(IXsdType type, List<IXsdValue> values) implements IXsdComplexType {
}
