package io.github.pabulaner.jxsd.impl;

import io.github.pabulaner.jxsd.api.IField;
import io.github.pabulaner.jxsd.api.IName;
import io.github.pabulaner.jxsd.api.IObject;
import io.github.pabulaner.jxsd.api.IType;

public class FieldImpl extends ObjectImpl implements IField {

    private final IName name;

    public FieldImpl(IType type, IName name) {
        super(type);
        this.name = name;
    }

    @Override
    public IName getName() {
        return name;
    }
}
