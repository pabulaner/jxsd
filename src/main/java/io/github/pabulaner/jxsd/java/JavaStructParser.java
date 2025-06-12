package io.github.pabulaner.jxsd.java;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.xsd.XsdComplexStruct;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import io.github.pabulaner.jxsd.xsd.XsdScope;
import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdStruct;

import java.io.IOException;

public class JavaStructParser {

    public JavaStructParser() {
        // empty
    }

    public void parse(String type, XsdResult xsd) throws IOException, TemplateException {
        XsdScope scope = xsd.scope();

        for (XsdStruct struct : xsd.structs()) {
            JavaResult result = switch (struct) {
                case XsdSimpleStruct.XsdPrimitiveStruct casted -> new JavaPrimitiveParser(type).parse(casted);
                case XsdSimpleStruct.XsdRestrictionStruct casted -> new JavaRestrictionParser(type, scope).parse(casted);
                case XsdSimpleStruct.XsdListStruct casted -> new JavaListParser(type).parse(casted);
                case XsdSimpleStruct.XsdUnionStruct casted -> new JavaUnionParser(type).parse(casted);
                case XsdComplexStruct casted -> new JavaComplexParser(type, scope).parse(casted);
                default -> throw new IllegalStateException("Unexpected value: " + struct);
            };

            System.out.println(result.content());
        }
    }
}
