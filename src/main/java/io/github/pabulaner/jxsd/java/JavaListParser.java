package io.github.pabulaner.jxsd.java;

import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;

import java.io.IOException;
import java.util.Map;

public class JavaListParser extends JavaParser<XsdSimpleStruct.XsdListStruct> {

    public JavaListParser(String type) throws IOException {
        super(type, "list.ftl", null);
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdListStruct struct, Map<String, Object> data) {
        data.put(JavaTemplate.NAME, struct.type().name());
        data.put(JavaTemplate.PARENT, struct.type().parentName());
    }
}
