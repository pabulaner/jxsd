package com.scell.model.drawingml.main;

public class Point2DModel {
  private final CoordinateValueModel y;

  private final CoordinateValueModel x;

  public Point2DModel(CoordinateValueModel y, CoordinateValueModel x) {
    this.y = y;
    this.x = x;
  }

  public CoordinateValueModel getY() {
    return this.y;
  }

  public CoordinateValueModel getX() {
    return this.x;
  }
}
