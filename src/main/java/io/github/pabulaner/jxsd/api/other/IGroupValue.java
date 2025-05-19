package io.github.pabulaner.jxsd.api.other;

import java.util.List;

public interface IGroupValue {

    enum Kind {

        SEQUENCE,
        UNION,
    }

    Kind getKind();

    List<IValue> getValues();
}
