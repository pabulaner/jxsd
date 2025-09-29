package jxsd.gen.model.drawingml.main;

import java.lang.String;
import jxsd.gen.builder.drawingml.main.AdjAngleValueBuilder;

/**
 * This is a generated union class.
 */
public class AdjAngleValueModel {
  private final String value;

  public AdjAngleValueModel(String value) {
    this.value = value;
  }

  public AdjAngleValueBuilder builder() {
    return new AdjAngleValueBuilder().from(this);
  }

  public String getValue() {
    return this.value;
  }
}
