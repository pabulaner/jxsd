package io.github.pabulaner.jxsd.xsd;

import java.util.List;

public record XsdGroupValue(String name, int minOccurs, int maxOccurs, Kind kind, List<XsdValue> values) implements XsdValue {

    public enum Kind {

        SEQUENCE,
        UNION,
    }
}
