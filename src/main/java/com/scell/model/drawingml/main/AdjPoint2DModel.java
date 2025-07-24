package com.scell.model.drawingml.main;

public class AdjPoint2DModel {
  private final AdjCoordinateModel y;

  private final AdjCoordinateModel x;

  public AdjPoint2DModel(AdjCoordinateModel y, AdjCoordinateModel x) {
    this.y = y;
    this.x = x;
  }

  public AdjCoordinateModel getY() {
    return this.y;
  }

  public AdjCoordinateModel getX() {
    return this.x;
  }
}
