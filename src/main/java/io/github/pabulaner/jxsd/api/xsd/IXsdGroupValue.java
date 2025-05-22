package io.github.pabulaner.jxsd.api.xsd;

import java.util.List;

public interface IXsdGroupValue extends IXsdValue {

    enum Kind {

        SEQUENCE,
        UNION,
    }

    Kind kind();

    List<IXsdValue> values();
}
