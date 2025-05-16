package io.github.pabulaner.jxsd.impl;

import io.github.pabulaner.jxsd.api.IClass;
import io.github.pabulaner.jxsd.api.IObject;
import io.github.pabulaner.jxsd.api.IPackage;
import io.github.pabulaner.jxsd.api.IType;

import java.util.List;

public class PackageImpl extends ObjectImpl implements IPackage {

    private final List<IPackage> packages;

    private final List<IClass> classes;

    public PackageImpl(IType type, List<IPackage> packages, List<IClass> classes) {
        super(type);

        this.packages = packages;
        this.classes = classes;
    }

    @Override
    public List<IPackage> getPackages() {
        return packages;
    }

    @Override
    public List<IClass> getClasses() {
        return classes;
    }
}
