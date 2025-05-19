package io.github.pabulaner.jxsd.api.input;

import java.util.List;

public interface IUnion extends ISimple {

    List<IType> getTypes();
}
