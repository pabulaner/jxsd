package io.github.pabulaner.jxsd.model;

import io.github.pabulaner.jxsd.api.model.IEnum;
import io.github.pabulaner.jxsd.api.model.IField;
import io.github.pabulaner.jxsd.api.model.IName;
import io.github.pabulaner.jxsd.api.model.IType;

import java.util.List;

public class EnumModel extends ClassModel implements IEnum {

    private final List<IName> values;

    public EnumModel(IType type, List<IField> fields, List<IName> values) {
        super(type, fields);
        this.values = values;
    }

    @Override
    public List<IName> getValues() {
        return values;
    }
}
