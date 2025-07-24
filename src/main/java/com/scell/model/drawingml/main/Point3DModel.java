package com.scell.model.drawingml.main;

public class Point3DModel {
  private final CoordinateModel y;

  private final CoordinateModel x;

  private final CoordinateModel z;

  public Point3DModel(CoordinateModel y, CoordinateModel x, CoordinateModel z) {
    this.y = y;
    this.x = x;
    this.z = z;
  }

  public CoordinateModel getY() {
    return this.y;
  }

  public CoordinateModel getX() {
    return this.x;
  }

  public CoordinateModel getZ() {
    return this.z;
  }
}
