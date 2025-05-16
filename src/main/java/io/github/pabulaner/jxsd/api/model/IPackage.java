package io.github.pabulaner.jxsd.api.model;

import java.util.List;

public interface IPackage extends IObject {

    List<IPackage> getPackages();

    List<IClass> getClasses();
}
