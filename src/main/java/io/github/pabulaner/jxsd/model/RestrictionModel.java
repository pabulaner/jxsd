package io.github.pabulaner.jxsd.model;

import io.github.pabulaner.jxsd.api.model.IName;
import io.github.pabulaner.jxsd.api.model.IRestriction;

import java.util.Map;

public class RestrictionModel implements IRestriction {

    private final IName name;

    private final Map<IName, IName> values;

    public RestrictionModel(IName name, Map<IName, IName> values) {
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
