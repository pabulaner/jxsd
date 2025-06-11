package io.github.pabulaner.jxsd.impl.xsd;

import java.util.List;

public record XsdGroupValue(int minOccurs, int maxOccurs, Kind kind, List<XsdValue> values) implements XsdValue {

    enum Kind {

        SEQUENCE,
        UNION,
    }
}
