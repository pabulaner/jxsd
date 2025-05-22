package io.github.pabulaner.jxsd.api.xsd;

import java.util.List;

public interface IXsdSimpleType extends IXsdModel {

    interface IXsdPrimitiveType extends IXsdSimpleType {
    }

    interface IXsdRestrictionType extends IXsdSimpleType {

        List<IXsdRestriction> restrictions();
    }

    interface IXsdListType extends IXsdSimpleType {

        IXsdType itemType();
    }

    interface IXsdUnionType extends IXsdSimpleType {

        List<IXsdType> types();
    }
}
