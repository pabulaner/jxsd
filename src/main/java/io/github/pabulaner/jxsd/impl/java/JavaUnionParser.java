package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdType;

import java.io.IOException;
import java.util.Map;

public class JavaUnionParser extends JavaParser<XsdSimpleStruct.XsdUnionStruct> {

    public JavaUnionParser() throws IOException {
        super("union.ftl", null);
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdUnionStruct struct, Map<String, Object> data) {
        data.put(NAME, JavaName.toClass(struct.type().name()));
        data.put(TYPES, struct.types()
                .stream()
                .map(XsdType::name)
                .map(JavaName::toClass)
                .toList());
    }
}
