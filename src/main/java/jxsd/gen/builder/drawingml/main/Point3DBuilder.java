package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.Point3DModel;

/**
 * This is a generated sequence class.
 */
public class Point3DBuilder {
  private long y;

  private long x;

  private long z;

  public Point3DBuilder() {
  }

  public Point3DBuilder setY(long y) {
    this.y = y;
    return this;
  }

  public Point3DBuilder setX(long x) {
    this.x = x;
    return this;
  }

  public Point3DBuilder setZ(long z) {
    this.z = z;
    return this;
  }

  public Point3DBuilder from(Point3DModel value) {
    this.y = value.getY();
    this.x = value.getX();
    this.z = value.getZ();
    return this;
  }

  public Point3DModel build() {
    return new Point3DModel(this.y, this.x, this.z);
  }
}
