package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.StretchInfoPropertiesBuilder;

/**
 * This is a generated sequence class.
 */
public class StretchInfoPropertiesModel {
  private final RelativeRectModel fillRect;

  public StretchInfoPropertiesModel(RelativeRectModel fillRect) {
    this.fillRect = fillRect;
  }

  public StretchInfoPropertiesBuilder builder() {
    return new StretchInfoPropertiesBuilder().from(this);
  }

  public RelativeRectModel getFillRect() {
    return this.fillRect;
  }
}
