package io.github.pabulaner.jxsd.model;

import io.github.pabulaner.jxsd.api.model.IName;
import io.github.pabulaner.jxsd.api.model.IPackage;
import io.github.pabulaner.jxsd.api.model.IRestriction;
import io.github.pabulaner.jxsd.api.model.IType;

import java.util.List;

public class TypeModel implements IType {

    private final IName name;

    private final IType base;

    private final List<IRestriction> restrictions;

    public TypeModel(IName name, IType base, List<IRestriction> restrictions) {
        this.name = name;
        this.base = base;
        this.restrictions = restrictions;
    }

    @Override
    public IName getName() {
        return name;
    }

    @Override
    public IType getBase() {
        return base;
    }

    @Override
    public List<IRestriction> getRestrictions() {
        return restrictions;
    }
}
