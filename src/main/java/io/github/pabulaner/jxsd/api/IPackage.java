package io.github.pabulaner.jxsd.api;

import java.util.List;

public interface IPackage extends IObject {

    List<IPackage> getPackages();

    List<IClass> getClasses();
}
