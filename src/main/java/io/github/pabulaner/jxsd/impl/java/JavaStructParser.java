package io.github.pabulaner.jxsd.impl.java;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.impl.xsd.XsdComplexStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdResult;
import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdStruct;

import java.io.IOException;

public class JavaStructParser {

    public JavaStructParser() {
        // empty
    }

    public void parse(XsdResult xsd) throws IOException, TemplateException {
        XsdScope scope = xsd.scope();

        for (XsdStruct struct : xsd.structs()) {
            String result = switch (struct) {
                case XsdSimpleStruct.XsdPrimitiveStruct casted -> new JavaPrimitiveParser().parse(casted);
                case XsdSimpleStruct.XsdRestrictionStruct casted -> new JavaRestrictionParser(scope).parse(casted);
                case XsdSimpleStruct.XsdListStruct casted -> new JavaListParser().parse(casted);
                case XsdSimpleStruct.XsdUnionStruct casted -> new JavaUnionParser().parse(casted);
                case XsdComplexStruct casted -> new JavaComplexParser(scope).parse(casted);
                default -> throw new IllegalStateException("Unexpected value: " + struct);
            };

            System.out.println(result);
        }
    }
}
