package io.github.pabulaner.jxsd.api;

import java.util.List;

public interface IType {

    IName getName();

    IType getBase();

    IPackage getPackage();

    List<IRestriction> getRestrictions();
}
