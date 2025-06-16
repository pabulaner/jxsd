package io.github.pabulaner.jxsd.java.parser;

import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;

import java.io.IOException;
import java.util.Map;

public class JavaListParser extends JavaParser<XsdSimpleStruct.XsdListStruct> {

    public JavaListParser(JavaParserConfig config) throws IOException {
        super(config.setTemplate("list.ftl"));
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdListStruct struct, Map<String, Object> data) {
        data.put(JavaTemplate.NAME, struct.type().name());
        data.put(JavaTemplate.PARENT, struct.itemType().name());
    }
}
