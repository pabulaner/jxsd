package io.github.pabulaner.jxsd.impl.xsd;

import io.github.pabulaner.jxsd.api.xsd.IRestriction;
import io.github.pabulaner.jxsd.api.xsd.ISimpleType;
import io.github.pabulaner.jxsd.api.xsd.IType;

import java.util.List;

public final class SimpleTypeImpl {

    public record PrimitiveTypeImpl(IType type) implements ISimpleType.IPrimitiveType {
    }

    public record RestrictionTypeImpl(IType type, List<IRestriction> restrictions) implements ISimpleType.IRestrictionType {
    }

    public record ListTypeImpl(IType type, IType itemType) implements ISimpleType.IListType {
    }

    public record UnionTypeImpl(IType type, List<IType> types) implements ISimpleType.IUnionType {
    }

    private SimpleTypeImpl() {
    }
}
