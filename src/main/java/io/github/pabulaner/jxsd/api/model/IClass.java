package io.github.pabulaner.jxsd.api.model;

import java.util.List;

public interface IClass extends IObject {

    List<IField> getFields();
}
