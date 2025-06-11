package io.github.pabulaner.jxsd.impl.java;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.impl.xsd.XsdResult;
import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdStruct;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JavaStructParser {

    public JavaStructParser() {
        // empty
    }

    public void parse(List<XsdResult> results) throws IOException, TemplateException {
        for (XsdResult result : results) {
            XsdScope scope = result.scope();

            for (XsdStruct struct : result.structs()) {
                switch (struct) {
                    case XsdSimpleStruct.XsdPrimitiveStruct casted -> new JavaPrimitiveParser().parse(casted);
                    case XsdSimpleStruct.XsdRestrictionStruct casted -> new JavaRestrictionParser(scope).parse(casted);
                    case XsdSimpleStruct.XsdListStruct casted -> new JavaListParser().parse(casted);
                    case XsdSimpleStruct.XsdUnionStruct casted -> new JavaUnionParser().parse(casted);
                    default -> {} // throw new IllegalStateException("Unexpected value: " + struct);
                }
            }
        }
    }
}
