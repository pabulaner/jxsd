package io.github.pabulaner.jxsd.api.other;

import java.util.List;

public interface ISimpleType extends IModel {

    interface IRestriction extends ISimpleType {

        List<IRestriction> getRestrictions();
    }

    interface IList extends ISimpleType {

        IType getItemType();
    }

    interface IUnion extends ISimpleType {

        List<IType> getTypes();
    }
}
