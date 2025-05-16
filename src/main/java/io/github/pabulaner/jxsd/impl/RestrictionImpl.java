package io.github.pabulaner.jxsd.impl;

import io.github.pabulaner.jxsd.api.IName;
import io.github.pabulaner.jxsd.api.IRestriction;

import java.util.Map;

public class RestrictionImpl implements IRestriction {

    private final IName name;

    private final Map<IName, IName> values;

    public RestrictionImpl(IName name, Map<IName, IName> values) {
        this.name = name;
        this.values = values;
    }

    @Override
    public IName getName() {
        return name;
    }

    @Override
    public IName getValue(IName key) {
        return values.get(key);
    }
}
