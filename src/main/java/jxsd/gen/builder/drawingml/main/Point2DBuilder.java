package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.Point2DModel;

/**
 * This is a generated sequence class.
 */
public class Point2DBuilder {
  private long y;

  private long x;

  public Point2DBuilder() {
  }

  public Point2DBuilder setY(long y) {
    this.y = y;
    return this;
  }

  public Point2DBuilder setX(long x) {
    this.x = x;
    return this;
  }

  public Point2DBuilder from(Point2DModel value) {
    this.y = value.getY();
    this.x = value.getX();
    return this;
  }

  public Point2DModel build() {
    return new Point2DModel(this.y, this.x);
  }
}
