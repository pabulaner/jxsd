package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.impl.xsd.XsdComplexStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdScope;

import java.io.IOException;
import java.util.Map;

public class XsdComplexParser extends JavaParser<XsdComplexStruct> {

    public XsdComplexParser(XsdScope scope) throws IOException {
        super("complex.ftl", scope);
    }

    @Override
    protected void parse(XsdComplexStruct struct, Map<String, Object> data) {

    }
}
