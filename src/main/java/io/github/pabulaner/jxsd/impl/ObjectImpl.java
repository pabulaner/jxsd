package io.github.pabulaner.jxsd.impl;

import io.github.pabulaner.jxsd.api.IObject;
import io.github.pabulaner.jxsd.api.IType;

public class ObjectImpl implements IObject {

    private final IType type;

    public ObjectImpl(IType type) {
        this.type = type;
    }

    @Override
    public IType getType() {
        return type;
    }
}
