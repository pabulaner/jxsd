package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdSimpleStruct;

import java.io.IOException;
import java.util.Map;

public class JavaPrimitiveParser extends JavaParser<XsdSimpleStruct.XsdPrimitiveStruct> {

    public JavaPrimitiveParser() throws IOException {
        super("primitive.ftl", null);
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdPrimitiveStruct struct, Map<String, Object> data) {
        data.put(NAME, JavaName.toClass(struct.type().name()));
        data.put(TYPE, JavaName.toPrimitive(struct.type().name()));
    }
}
