package io.github.pabulaner.jxsd.api.input;

import java.util.List;

public interface IComplex extends IHasType {

    List<IAttribute> getAttributes();

    List<IAttributeGroup> getAttributeGroups();

    List<IElement> getElements();

    List<IElementGroup> getElementGroups();
}
