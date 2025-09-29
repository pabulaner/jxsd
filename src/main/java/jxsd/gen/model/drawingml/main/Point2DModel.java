package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.Point2DBuilder;

/**
 * This is a generated sequence class.
 */
public class Point2DModel {
  private final long y;

  private final long x;

  public Point2DModel(long y, long x) {
    this.y = y;
    this.x = x;
  }

  public Point2DBuilder builder() {
    return new Point2DBuilder().from(this);
  }

  public long getY() {
    return this.y;
  }

  public long getX() {
    return this.x;
  }
}
