package io.github.pabulaner.jxsd.java.parser;

import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdType;

import java.io.IOException;
import java.util.Map;

public class JavaUnionParser extends JavaParser<XsdSimpleStruct.XsdUnionStruct> {

    public JavaUnionParser(JavaParserConfig config) throws IOException {
        super(config.setTemplate("union.ftl"));
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdUnionStruct struct, Map<String, Object> data) {
        data.put(JavaTemplate.NAME, struct.type().name());
        data.put(JavaTemplate.TYPES, struct.types()
                .stream()
                .map(XsdType::name)
                .toList());
    }
}
