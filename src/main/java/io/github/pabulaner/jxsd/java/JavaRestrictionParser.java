package io.github.pabulaner.jxsd.java;

import io.github.pabulaner.jxsd.xsd.XsdScope;
import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JavaRestrictionParser extends JavaParser<XsdSimpleStruct.XsdRestrictionStruct> {

    public JavaRestrictionParser(String type, XsdScope scope) throws IOException {
        super(type, "restriction.ftl", scope);
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdRestrictionStruct struct, Map<String, Object> data) {
        XsdType type = struct.type();
        List<String> restrictions = new ArrayList<>();

        struct.restrictions().forEach(restriction -> {
            String value = restriction.value();
            String result = switch (restriction.name()) {
                case "minInclusive" -> "value >= " + value;
                case "maxInclusive" -> "value <= " + value;
                case "pattern" -> "value.matches(\"" + value + "\")";
                default -> "true";
            };

            restrictions.add(result);
        });

        data.put(JavaTemplate.NAME, type.name());
        data.put(JavaTemplate.TYPE, getScope().getTopParent(type).name());
        data.put(JavaTemplate.PARENT, type.parentName());
        data.put(JavaTemplate.RESTRICTIONS, restrictions);
    }
}
