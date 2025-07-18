package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_PathShadePropertiesModel;
import com.scell.model.drawingml.main.CT_RelativeRectModel;
import com.scell.model.drawingml.main.ST_PathShadeTypeModel;

public class CT_PathShadePropertiesBuilder {
  private ST_PathShadeTypeModel path;

  private CT_RelativeRectModel fillToRect;

  public CT_PathShadePropertiesBuilder() {
  }

  public CT_PathShadePropertiesBuilder setPath(ST_PathShadeTypeModel path) {
    this.path = path;
    return this;
  }

  public CT_PathShadePropertiesBuilder setFillToRect(CT_RelativeRectModel fillToRect) {
    this.fillToRect = fillToRect;
    return this;
  }

  public CT_PathShadePropertiesModel build() {
    return new CT_PathShadePropertiesModel(this.path, this.fillToRect);
  }

  public CT_PathShadePropertiesBuilder from(CT_PathShadePropertiesModel value) {
    this.path = value.getPath();
    this.fillToRect = value.getFillToRect();
    return this;
  }
}
