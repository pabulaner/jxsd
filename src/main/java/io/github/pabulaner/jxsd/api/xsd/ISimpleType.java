package io.github.pabulaner.jxsd.api.xsd;

import java.util.List;

public interface ISimpleType extends IModel {

    interface IPrimitiveType extends ISimpleType {
    }

    interface IRestrictionType extends ISimpleType {

        List<IRestriction> restrictions();
    }

    interface IListType extends ISimpleType {

        IType itemType();
    }

    interface IUnionType extends ISimpleType {

        List<IType> types();
    }
}
