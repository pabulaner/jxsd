package io.github.pabulaner.jxsd.api.model;

import java.util.List;

public interface IEnum extends IClass {

    List<IName> getValues();
}
