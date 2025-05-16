package io.github.pabulaner.jxsd.impl;

import io.github.pabulaner.jxsd.api.IEnum;
import io.github.pabulaner.jxsd.api.IField;
import io.github.pabulaner.jxsd.api.IName;
import io.github.pabulaner.jxsd.api.IType;

import java.util.List;

public class EnumImpl extends ClassImpl implements IEnum {

    private final List<IName> values;

    public EnumImpl(IType type, List<IField> fields, List<IName> values) {
        super(type, fields);
        this.values = values;
    }

    @Override
    public List<IName> getValues() {
        return values;
    }
}
