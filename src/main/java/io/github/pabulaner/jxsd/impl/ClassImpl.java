package io.github.pabulaner.jxsd.impl;

import io.github.pabulaner.jxsd.api.IClass;
import io.github.pabulaner.jxsd.api.IField;
import io.github.pabulaner.jxsd.api.IType;

import java.util.List;

public class ClassImpl extends ObjectImpl implements IClass {

    private final List<IField> fields;

    public ClassImpl(IType type, List<IField> fields) {
        super(type);
        this.fields = fields;
    }

    @Override
    public List<IField> getFields() {
        return null;
    }
}
