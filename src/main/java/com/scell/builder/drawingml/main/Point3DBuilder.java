package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateModel;
import com.scell.model.drawingml.main.Point3DModel;

public class Point3DBuilder {
  private CoordinateModel y;

  private CoordinateModel x;

  private CoordinateModel z;

  public Point3DBuilder() {
  }

  public Point3DBuilder setY(CoordinateModel y) {
    this.y = y;
    return this;
  }

  public Point3DBuilder setX(CoordinateModel x) {
    this.x = x;
    return this;
  }

  public Point3DBuilder setZ(CoordinateModel z) {
    this.z = z;
    return this;
  }

  public Point3DModel build() {
    return new Point3DModel(this.y, this.x, this.z);
  }

  public Point3DBuilder from(Point3DModel value) {
    this.y = value.getY();
    this.x = value.getX();
    this.z = value.getZ();
    return this;
  }
}
