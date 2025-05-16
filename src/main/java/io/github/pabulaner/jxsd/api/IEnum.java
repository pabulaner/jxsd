package io.github.pabulaner.jxsd.api;

import java.util.List;

public interface IEnum extends IClass {

    List<IName> getValues();
}
