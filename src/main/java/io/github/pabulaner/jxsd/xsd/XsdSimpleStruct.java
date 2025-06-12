package io.github.pabulaner.jxsd.xsd;

import java.util.List;

public interface XsdSimpleStruct extends XsdStruct {

    record XsdPrimitiveStruct(XsdType type) implements XsdSimpleStruct {
    }

    record XsdRestrictionStruct(XsdType type, List<XsdRestriction> restrictions) implements XsdSimpleStruct {
    }

    record XsdListStruct(XsdType type, XsdType itemType) implements XsdSimpleStruct {
    }

    record XsdUnionStruct(XsdType type, List<XsdType> types) implements XsdSimpleStruct {
    }
}
