package io.github.pabulaner.jxsd.java;

import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdType;

import java.io.IOException;
import java.util.Map;

public class JavaUnionParser extends JavaParser<XsdSimpleStruct.XsdUnionStruct> {

    public JavaUnionParser(String type) throws IOException {
        super(type, "union.ftl", null);
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdUnionStruct struct, Map<String, Object> data) {
        data.put(JavaTemplate.NAME, JavaName.toClass(struct.type().name()));
        data.put(JavaTemplate.TYPES, struct.types()
                .stream()
                .map(XsdType::name)
                .map(JavaName::toClass)
                .toList());
    }
}
