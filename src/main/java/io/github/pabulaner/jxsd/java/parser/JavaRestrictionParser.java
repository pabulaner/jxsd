package io.github.pabulaner.jxsd.java.parser;

import io.github.pabulaner.jxsd.xsd.XsdSimpleStruct;
import io.github.pabulaner.jxsd.xsd.XsdType;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JavaRestrictionParser extends JavaParser<XsdSimpleStruct.XsdRestrictionStruct> {

    public JavaRestrictionParser(JavaParserConfig config) throws IOException {
        super(config.setTemplate("restriction.ftl"));
    }

    @Override
    protected void parse(XsdSimpleStruct.XsdRestrictionStruct struct, Map<String, Object> data) {
        XsdType type = struct.type();
        List<String> restrictions = new ArrayList<>();

//        TODO: uncomment
//
//        struct.restrictions().forEach(restriction -> {
//            String value = restriction.value();
//            String result = switch (restriction.name()) {
//                case "minInclusive" -> "value >= " + value;
//                case "maxInclusive" -> "value <= " + value;
//                case "pattern" -> "value.matches(\"" + value + "\")";
//                default -> "true";
//            };
//
//            restrictions.add(result);
//        });

        data.put(JavaTemplate.NAME, type.name());
        data.put(JavaTemplate.TYPE, getConfig().getScope().getTopParent(type).name());
        data.put(JavaTemplate.PARENT, type.parentName());
        data.put(JavaTemplate.RESTRICTIONS, restrictions);
    }
}
