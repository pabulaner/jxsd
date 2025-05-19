package io.github.pabulaner.jxsd.impl.xsd;

import io.github.pabulaner.jxsd.api.xsd.IComplexType;
import io.github.pabulaner.jxsd.api.xsd.IType;
import io.github.pabulaner.jxsd.api.xsd.IValue;

import java.util.List;

public record ComplexTypeImpl(IType type, List<IValue> values) implements IComplexType {
}
