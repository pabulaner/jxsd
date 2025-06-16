package io.github.pabulaner.jxsd.java.parser;

import freemarker.template.TemplateException;
import io.github.pabulaner.jxsd.xsd.XsdComplexStruct;
import io.github.pabulaner.jxsd.xsd.XsdResult;
import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdStruct;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JavaStructParser {

    public JavaStructParser() {
        // empty
    }

    public List<JavaResult> parse(String type, XsdResult xsd) throws IOException, TemplateException {
        List<JavaResult> results = new ArrayList<>();

        for (XsdStruct struct : xsd.structs()) {
            JavaParserConfig config = new JavaParserConfig()
                    .setBase(null)
                    .setType(type)
                    .setScope(xsd.scope());

            JavaResult result = switch (struct) {
                case XsdSimpleStruct.XsdPrimitiveStruct casted -> new JavaPrimitiveParser(config).parse(casted);
                case XsdSimpleStruct.XsdRestrictionStruct casted -> new JavaRestrictionParser(config).parse(casted);
                case XsdSimpleStruct.XsdListStruct casted -> new JavaListParser(config).parse(casted);
                case XsdSimpleStruct.XsdUnionStruct casted -> new JavaUnionParser(config).parse(casted);
                case XsdComplexStruct casted -> new JavaComplexParser(config).parse(casted);
                default -> throw new IllegalStateException("Unexpected value: " + struct);
            };

            results.add(result);
        }

        return results;
    }
}
