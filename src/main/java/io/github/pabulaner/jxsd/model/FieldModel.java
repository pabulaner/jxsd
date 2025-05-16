package io.github.pabulaner.jxsd.model;

import io.github.pabulaner.jxsd.api.model.IField;
import io.github.pabulaner.jxsd.api.model.IName;
import io.github.pabulaner.jxsd.api.model.IType;

public class FieldModel extends ObjectModel implements IField {

    private final IName name;

    public FieldModel(IType type, IName name) {
        super(type);
        this.name = name;
    }

    @Override
    public IName getName() {
        return name;
    }
}
