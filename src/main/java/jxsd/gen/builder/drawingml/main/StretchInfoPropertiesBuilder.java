package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.RelativeRectModel;
import jxsd.gen.model.drawingml.main.StretchInfoPropertiesModel;

/**
 * This is a generated sequence class.
 */
public class StretchInfoPropertiesBuilder {
  private RelativeRectModel fillRect;

  public StretchInfoPropertiesBuilder() {
  }

  public StretchInfoPropertiesBuilder setFillRect(RelativeRectModel fillRect) {
    this.fillRect = fillRect;
    return this;
  }

  public StretchInfoPropertiesBuilder from(StretchInfoPropertiesModel value) {
    this.fillRect = value.getFillRect();
    return this;
  }

  public StretchInfoPropertiesModel build() {
    return new StretchInfoPropertiesModel(this.fillRect);
  }
}
