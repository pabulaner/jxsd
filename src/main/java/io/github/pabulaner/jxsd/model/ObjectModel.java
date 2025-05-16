package io.github.pabulaner.jxsd.model;

import io.github.pabulaner.jxsd.api.model.IObject;
import io.github.pabulaner.jxsd.api.model.IType;

public class ObjectModel implements IObject {

    private final IType type;

    public ObjectModel(IType type) {
        this.type = type;
    }

    @Override
    public IType getType() {
        return type;
    }
}
