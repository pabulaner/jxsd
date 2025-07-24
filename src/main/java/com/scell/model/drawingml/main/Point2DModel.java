package com.scell.model.drawingml.main;

public class Point2DModel {
  private final CoordinateModel y;

  private final CoordinateModel x;

  public Point2DModel(CoordinateModel y, CoordinateModel x) {
    this.y = y;
    this.x = x;
  }

  public CoordinateModel getY() {
    return this.y;
  }

  public CoordinateModel getX() {
    return this.x;
  }
}
