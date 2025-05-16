package io.github.pabulaner.jxsd.model;

import io.github.pabulaner.jxsd.api.model.IClass;
import io.github.pabulaner.jxsd.api.model.IField;
import io.github.pabulaner.jxsd.api.model.IType;

import java.util.List;

public class ClassModel extends ObjectModel implements IClass {

    private final List<IField> fields;

    public ClassModel(IType type, List<IField> fields) {
        super(type);
        this.fields = fields;
    }

    @Override
    public List<IField> getFields() {
        return fields;
    }
}
