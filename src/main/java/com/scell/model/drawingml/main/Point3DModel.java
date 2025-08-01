package com.scell.model.drawingml.main;

public class Point3DModel {
  private final CoordinateValueModel y;

  private final CoordinateValueModel x;

  private final CoordinateValueModel z;

  public Point3DModel(CoordinateValueModel y, CoordinateValueModel x, CoordinateValueModel z) {
    this.y = y;
    this.x = x;
    this.z = z;
  }

  public CoordinateValueModel getY() {
    return this.y;
  }

  public CoordinateValueModel getX() {
    return this.x;
  }

  public CoordinateValueModel getZ() {
    return this.z;
  }
}
