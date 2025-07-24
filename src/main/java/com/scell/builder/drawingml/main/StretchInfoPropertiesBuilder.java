package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.RelativeRectModel;
import com.scell.model.drawingml.main.StretchInfoPropertiesModel;

public class StretchInfoPropertiesBuilder {
  private RelativeRectModel fillRect;

  public StretchInfoPropertiesBuilder() {
  }

  public StretchInfoPropertiesBuilder setFillRect(RelativeRectModel fillRect) {
    this.fillRect = fillRect;
    return this;
  }

  public StretchInfoPropertiesModel build() {
    return new StretchInfoPropertiesModel(this.fillRect);
  }

  public StretchInfoPropertiesBuilder from(StretchInfoPropertiesModel value) {
    this.fillRect = value.getFillRect();
    return this;
  }
}
