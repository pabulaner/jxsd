package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_RelativeRectModel;
import com.scell.model.drawingml.main.CT_StretchInfoPropertiesModel;

public class CT_StretchInfoPropertiesBuilder {
  private CT_RelativeRectModel fillRect;

  public CT_StretchInfoPropertiesBuilder() {
  }

  public CT_StretchInfoPropertiesBuilder setFillRect(CT_RelativeRectModel fillRect) {
    this.fillRect = fillRect;
    return this;
  }

  public CT_StretchInfoPropertiesModel build() {
    return new CT_StretchInfoPropertiesModel(this.fillRect);
  }

  public CT_StretchInfoPropertiesBuilder from(CT_StretchInfoPropertiesModel value) {
    this.fillRect = value.getFillRect();
    return this;
  }
}
