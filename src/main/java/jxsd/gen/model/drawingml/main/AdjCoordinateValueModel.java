package jxsd.gen.model.drawingml.main;

import java.lang.String;
import jxsd.gen.builder.drawingml.main.AdjCoordinateValueBuilder;

/**
 * This is a generated union class.
 */
public class AdjCoordinateValueModel {
  private final String value;

  public AdjCoordinateValueModel(String value) {
    this.value = value;
  }

  public AdjCoordinateValueBuilder builder() {
    return new AdjCoordinateValueBuilder().from(this);
  }

  public String getValue() {
    return this.value;
  }
}
