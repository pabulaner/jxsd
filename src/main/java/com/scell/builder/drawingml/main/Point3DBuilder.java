package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CoordinateValueModel;
import com.scell.model.drawingml.main.Point3DModel;

public class Point3DBuilder {
  private CoordinateValueModel y;

  private CoordinateValueModel x;

  private CoordinateValueModel z;

  public Point3DBuilder() {
  }

  public Point3DBuilder setY(CoordinateValueModel y) {
    this.y = y;
    return this;
  }

  public Point3DBuilder setX(CoordinateValueModel x) {
    this.x = x;
    return this;
  }

  public Point3DBuilder setZ(CoordinateValueModel z) {
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
