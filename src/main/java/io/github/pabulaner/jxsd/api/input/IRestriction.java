package io.github.pabulaner.jxsd.api.input;

import java.util.List;

public interface IRestriction extends ISimple {

    List<IFacet> getFacets();
}
