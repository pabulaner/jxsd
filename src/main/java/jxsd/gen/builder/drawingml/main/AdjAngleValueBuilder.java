package jxsd.gen.builder.drawingml.main;

import java.lang.String;
import jxsd.gen.model.drawingml.main.AdjAngleValueModel;

/**
 * This is a generated union class.
 */
public class AdjAngleValueBuilder {
  private String value;

  public AdjAngleValueBuilder() {
  }

  public AdjAngleValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public AdjAngleValueBuilder from(AdjAngleValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public AdjAngleValueModel build() {
    return new AdjAngleValueModel(this.value);
  }
}
