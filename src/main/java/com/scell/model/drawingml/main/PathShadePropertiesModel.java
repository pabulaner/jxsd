package com.scell.model.drawingml.main;

public class PathShadePropertiesModel {
  private final PathShadeTypeValueModel path;

  private final RelativeRectModel fillToRect;

  public PathShadePropertiesModel(PathShadeTypeValueModel path, RelativeRectModel fillToRect) {
    this.path = path;
    this.fillToRect = fillToRect;
  }

  public PathShadeTypeValueModel getPath() {
    return this.path;
  }

  public RelativeRectModel getFillToRect() {
    return this.fillToRect;
  }
}
