package io.github.pabulaner.jxsd.api.xsd;

import java.util.List;

public interface IGroupValue extends IValue {

    enum Kind {

        SEQUENCE,
        UNION,
    }

    Kind kind();

    List<IValue> values();
}
