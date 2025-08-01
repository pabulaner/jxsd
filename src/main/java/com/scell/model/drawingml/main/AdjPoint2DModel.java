package com.scell.model.drawingml.main;

public class AdjPoint2DModel {
  private final AdjCoordinateValueModel y;

  private final AdjCoordinateValueModel x;

  public AdjPoint2DModel(AdjCoordinateValueModel y, AdjCoordinateValueModel x) {
    this.y = y;
    this.x = x;
  }

  public AdjCoordinateValueModel getY() {
    return this.y;
  }

  public AdjCoordinateValueModel getX() {
    return this.x;
  }
}
