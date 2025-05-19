package io.github.pabulaner.jxsd.api.input;

import java.util.List;

public interface IGroup extends IElement {

    enum Kind {
        SEQUENCE,
        CHOICE,
        ALL
    }

    Kind getKind();

    List<IElement> getElements();
}
