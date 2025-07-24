package com.scell.model.drawingml.main;

public class PathShadePropertiesModel {
  private final PathShadeTypeModel path;

  private final RelativeRectModel fillToRect;

  public PathShadePropertiesModel(PathShadeTypeModel path, RelativeRectModel fillToRect) {
    this.path = path;
    this.fillToRect = fillToRect;
  }

  public PathShadeTypeModel getPath() {
    return this.path;
  }

  public RelativeRectModel getFillToRect() {
    return this.fillToRect;
  }
}
