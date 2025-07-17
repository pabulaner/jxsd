package com.scell.model.drawingml.main;

public class CT_Point3DModel {
  private final ST_CoordinateModel y;

  private final ST_CoordinateModel x;

  private final ST_CoordinateModel z;

  public CT_Point3DModel(ST_CoordinateModel y, ST_CoordinateModel x, ST_CoordinateModel z) {
    this.y = y;
    this.x = x;
    this.z = z;
  }

  public ST_CoordinateModel getY() {
    return this.y;
  }

  public ST_CoordinateModel getX() {
    return this.x;
  }

  public ST_CoordinateModel getZ() {
    return this.z;
  }
}
