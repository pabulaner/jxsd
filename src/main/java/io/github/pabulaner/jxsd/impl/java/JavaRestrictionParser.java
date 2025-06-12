package io.github.pabulaner.jxsd.impl.java;

import io.github.pabulaner.jxsd.impl.xsd.XsdRestriction;
import io.github.pabulaner.jxsd.impl.xsd.XsdScope;
import io.github.pabulaner.jxsd.impl.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.impl.xsd.XsdType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JavaRestrictionParser extends JavaParser<XsdSimpleStruct.XsdRestrictionStruct> {

    public JavaRestrictionParser(XsdScope scope) throws IOException {
        super("restriction.ftl", scope);
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

        System.out.println(type.name());

        data.put(NAME, JavaName.toClass(type.name()));
        data.put(TYPE, JavaName.toPrimitive(getScope().getTopParent(type).name()));
        data.put(PARENT, JavaName.toClass(type.parentName()));
        data.put(RESTRICTIONS, restrictions);
    }
}
