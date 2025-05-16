package io.github.pabulaner.jxsd.impl;

import io.github.pabulaner.jxsd.api.IName;
import io.github.pabulaner.jxsd.api.IPackage;
import io.github.pabulaner.jxsd.api.IRestriction;
import io.github.pabulaner.jxsd.api.IType;

import java.util.List;

public class TypeImpl implements IType {

    private final IName name;

    private final IType base;

    private final IPackage pack;

    private final List<IRestriction> restrictions;

    public TypeImpl(IName name, IType base, IPackage pack, List<IRestriction> restrictions) {
        this.name = name;
        this.base = base;
        this.pack = pack;
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
    public IPackage getPackage() {
        return pack;
    }

    @Override
    public List<IRestriction> getRestrictions() {
        return restrictions;
    }
}
