package io.github.pabulaner.jxsd.java;

import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;

import java.io.IOException;
import java.util.Map;

public class JavaPrimitiveParser extends JavaParser<XsdSimpleStruct.XsdPrimitiveStruct> {

    public JavaPrimitiveParser(String type) throws IOException {
        super(type, "primitive.ftl", null);
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdPrimitiveStruct struct, Map<String, Object> data) {
        data.put(JavaTemplate.NAME, JavaName.toClass(struct.type().name()));
        data.put(JavaTemplate.TYPE, JavaName.toPrimitive(struct.type().name()));
    }
}
