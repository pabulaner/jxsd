package com.scell.model.drawingml.main;

public class Vector3DModel {
  private final CoordinateValueModel dz;

  private final CoordinateValueModel dy;

  private final CoordinateValueModel dx;

  public Vector3DModel(CoordinateValueModel dz, CoordinateValueModel dy, CoordinateValueModel dx) {
    this.dz = dz;
    this.dy = dy;
    this.dx = dx;
  }

  public CoordinateValueModel getDz() {
    return this.dz;
  }

  public CoordinateValueModel getDy() {
    return this.dy;
  }

  public CoordinateValueModel getDx() {
    return this.dx;
  }
}
