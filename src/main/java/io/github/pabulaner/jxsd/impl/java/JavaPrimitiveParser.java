package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdSimpleStruct;

import java.io.IOException;
import java.util.Map;

public class JavaPrimitiveParser extends JavaParser<XsdSimpleStruct.XsdPrimitiveStruct> {

    public JavaPrimitiveParser(XsdScope scope) throws IOException {
        super("primitive.ftl", scope);
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdPrimitiveStruct struct, Map<String, Object> data) {
        data.put("name", struct.type().name());
        data.put("type", xsdResult.getPrimitiveType(xsd.type()).name());
    }
}
