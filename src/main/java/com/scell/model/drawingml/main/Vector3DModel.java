package com.scell.model.drawingml.main;

public class Vector3DModel {
  private final CoordinateModel dz;

  private final CoordinateModel dy;

  private final CoordinateModel dx;

  public Vector3DModel(CoordinateModel dz, CoordinateModel dy, CoordinateModel dx) {
    this.dz = dz;
    this.dy = dy;
    this.dx = dx;
  }

  public CoordinateModel getDz() {
    return this.dz;
  }

  public CoordinateModel getDy() {
    return this.dy;
  }

  public CoordinateModel getDx() {
    return this.dx;
  }
}
