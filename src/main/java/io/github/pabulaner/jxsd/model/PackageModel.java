package io.github.pabulaner.jxsd.model;

import io.github.pabulaner.jxsd.api.model.IClass;
import io.github.pabulaner.jxsd.api.model.IPackage;
import io.github.pabulaner.jxsd.api.model.IType;

import java.util.List;

public class PackageModel extends ObjectModel implements IPackage {

    private final List<IPackage> packages;

    private final List<IClass> classes;

    public PackageModel(IType type, List<IPackage> packages, List<IClass> classes) {
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
