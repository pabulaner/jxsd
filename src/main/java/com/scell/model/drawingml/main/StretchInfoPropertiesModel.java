package com.scell.model.drawingml.main;

public class StretchInfoPropertiesModel {
  private final RelativeRectModel fillRect;

  public StretchInfoPropertiesModel(RelativeRectModel fillRect) {
    this.fillRect = fillRect;
  }

  public RelativeRectModel getFillRect() {
    return this.fillRect;
  }
}
