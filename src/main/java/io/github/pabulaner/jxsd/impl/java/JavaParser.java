package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaModel;
import io.github.pabulaner.jxsd.api.java.IJavaType;
import io.github.pabulaner.jxsd.api.java.IJavaValidator;
import io.github.pabulaner.jxsd.api.xsd.IComplexType;
import io.github.pabulaner.jxsd.api.xsd.IElementValue;
import io.github.pabulaner.jxsd.api.xsd.IGroupValue;
import io.github.pabulaner.jxsd.api.xsd.IModel;
import io.github.pabulaner.jxsd.api.xsd.IType;
import io.github.pabulaner.jxsd.api.xsd.IValue;

import java.util.ArrayList;
import java.util.List;

public class JavaParser {

    private static final int GROUP_AUTO_NAME_COUNT = 3;

    public List<IJavaModel> parse(List<IModel> xsd) {
        return xsd.stream()
                .map(this::parseModel)
                .toList();
    }

    private IJavaModel parseModel(IModel xsd) {
        if (xsd instanceof IComplexType complex) {
            return parseComplex(complex);
        }

        return null;
    }

    private IJavaClass parseComplex(IComplexType xsd) {
        IJavaType type = parseType(xsd.type(), false);

        List<IJavaField> fields = new ArrayList<>();
        List<IJavaModel> inners = new ArrayList<>();

        xsd.values().forEach(value -> parseValue(value, fields, inners));
        return new JavaClassImpl(type, fields, inners);
    }

    private void parseValue(IValue value, List<IJavaField> fields, List<IJavaModel> inners) {
        if (value instanceof IElementValue element) {
            fields.add(parseElement(element));
        }

        if (value instanceof IGroupValue group) {
            parseGroup(group, fields, inners);
        }
    }

    private IJavaField parseElement(IElementValue xsd) {
        IJavaType type = parseType(xsd.type(), xsd.maxOccurs() > 1);
        return new JavaFieldImpl(type, xsd.name(), xsd.value(), new ArrayList<>());
    }

    private void parseGroup(IGroupValue group, List<IJavaField> fields, List<IJavaModel> inners) {
        // TODO: handle maxOccurs > 1
        group.values().forEach(value -> parseValue(value, fields, inners));
    }

    private IJavaType parseType(IType xsd, boolean list) {
        return new JavaTypeImpl(xsd.name(), xsd.parent(), list);
    }
}
