package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.impl.xsd.XsdSimpleStruct;

import java.io.IOException;
import java.util.Map;

public class JavaListParser extends JavaParser<XsdSimpleStruct.XsdListStruct> {

    public JavaListParser() throws IOException {
        super("list.ftl", null);
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdListStruct struct, Map<String, Object> data) {
        data.put(NAME, JavaName.toClass(struct.type().name()));
        data.put(PARENT, JavaName.toClass(struct.type().parentName()));
    }
}
