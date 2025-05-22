package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.api.java.IJavaClass;
import io.github.pabulaner.jxsd.api.java.IJavaField;
import io.github.pabulaner.jxsd.api.java.IJavaModel;
import io.github.pabulaner.jxsd.api.java.IJavaType;
import io.github.pabulaner.jxsd.api.xsd.IXsdComplexType;
import io.github.pabulaner.jxsd.api.xsd.IXsdElementValue;
import io.github.pabulaner.jxsd.api.xsd.IXsdGroupValue;
import io.github.pabulaner.jxsd.api.xsd.IXsdModel;
import io.github.pabulaner.jxsd.api.xsd.IXsdType;
import io.github.pabulaner.jxsd.api.xsd.IXsdValue;

import java.util.ArrayList;
import java.util.List;

public class JavaParser {

    private static final int GROUP_AUTO_NAME_COUNT = 3;

    public List<IJavaModel> parse(List<IXsdModel> xsd) {
        return xsd.stream()
                .map(this::parseModel)
                .toList();
    }

    private IJavaModel parseModel(IXsdModel xsd) {
        if (xsd instanceof IXsdComplexType complex) {
            return parseComplex(complex);
        }

        return null;
    }

    private IJavaClass parseComplex(IXsdComplexType xsd) {
        IJavaType type = parseType(xsd.type(), false);

        List<IJavaField> fields = new ArrayList<>();
        List<IJavaModel> inners = new ArrayList<>();

        xsd.values().forEach(value -> parseValue(value, fields, inners));
        return new JavaClassImpl(type, fields, inners);
    }

    private void parseValue(IXsdValue value, List<IJavaField> fields, List<IJavaModel> inners) {
        if (value instanceof IXsdElementValue element) {
            fields.add(parseElement(element));
        }

        if (value instanceof IXsdGroupValue group) {
            parseGroup(group, fields, inners);
        }
    }

    private IJavaField parseElement(IXsdElementValue xsd) {
        IJavaType type = parseType(xsd.type(), xsd.maxOccurs() > 1);
        return new JavaFieldImpl(type, xsd.name(), xsd.value(), new ArrayList<>());
    }

    private void parseGroup(IXsdGroupValue group, List<IJavaField> fields, List<IJavaModel> inners) {
        // TODO: handle maxOccurs > 1
        group.values().forEach(value -> parseValue(value, fields, inners));
    }

    private IJavaType parseType(IXsdType xsd, boolean list) {
        return new JavaTypeImpl(xsd.name(), xsd.parent(), list);
    }
}
