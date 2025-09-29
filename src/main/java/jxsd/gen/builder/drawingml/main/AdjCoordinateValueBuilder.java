package jxsd.gen.builder.drawingml.main;

import java.lang.String;
import jxsd.gen.model.drawingml.main.AdjCoordinateValueModel;

/**
 * This is a generated union class.
 */
public class AdjCoordinateValueBuilder {
  private String value;

  public AdjCoordinateValueBuilder() {
  }

  public AdjCoordinateValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public AdjCoordinateValueBuilder from(AdjCoordinateValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public AdjCoordinateValueModel build() {
    return new AdjCoordinateValueModel(this.value);
  }
}
