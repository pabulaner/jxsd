package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PathShadePropertiesModel;
import com.scell.model.drawingml.main.PathShadeTypeModel;
import com.scell.model.drawingml.main.RelativeRectModel;

public class PathShadePropertiesBuilder {
  private PathShadeTypeModel path;

  private RelativeRectModel fillToRect;

  public PathShadePropertiesBuilder() {
  }

  public PathShadePropertiesBuilder setPath(PathShadeTypeModel path) {
    this.path = path;
    return this;
  }

  public PathShadePropertiesBuilder setFillToRect(RelativeRectModel fillToRect) {
    this.fillToRect = fillToRect;
    return this;
  }

  public PathShadePropertiesModel build() {
    return new PathShadePropertiesModel(this.path, this.fillToRect);
  }

  public PathShadePropertiesBuilder from(PathShadePropertiesModel value) {
    this.path = value.getPath();
    this.fillToRect = value.getFillToRect();
    return this;
  }
}
