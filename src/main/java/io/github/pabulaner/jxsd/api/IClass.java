package io.github.pabulaner.jxsd.api;

import java.util.List;

public interface IClass extends IObject {

    List<IField> getFields();
}
