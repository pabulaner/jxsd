package io.github.pabulaner.jxsd.impl.xsd;

import io.github.pabulaner.jxsd.api.xsd.IXsdRestriction;
import io.github.pabulaner.jxsd.api.xsd.IXsdSimpleType;
import io.github.pabulaner.jxsd.api.xsd.IXsdType;

import java.util.List;

public final class XsdSimpleTypeImpl {

    public record XsdPrimitiveTypeImpl(IXsdType type) implements IXsdSimpleType.IXsdPrimitiveType {
    }

    public record XsdRestrictionTypeImpl(IXsdType type, List<IXsdRestriction> restrictions) implements IXsdSimpleType.IXsdRestrictionType {
    }

    public record XsdListTypeImpl(IXsdType type, IXsdType itemType) implements IXsdSimpleType.IXsdListType {
    }

    public record XsdUnionTypeImpl(IXsdType type, List<IXsdType> types) implements IXsdSimpleType.IXsdUnionType {
    }

    private XsdSimpleTypeImpl() {
    }
}
