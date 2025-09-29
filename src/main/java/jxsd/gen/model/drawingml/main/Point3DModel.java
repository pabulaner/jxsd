package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.Point3DBuilder;

/**
 * This is a generated sequence class.
 */
public class Point3DModel {
  private final long y;

  private final long x;

  private final long z;

  public Point3DModel(long y, long x, long z) {
    this.y = y;
    this.x = x;
    this.z = z;
  }

  public Point3DBuilder builder() {
    return new Point3DBuilder().from(this);
  }

  public long getY() {
    return this.y;
  }

  public long getX() {
    return this.x;
  }

  public long getZ() {
    return this.z;
  }
}
