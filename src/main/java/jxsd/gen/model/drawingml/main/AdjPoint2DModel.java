package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.AdjPoint2DBuilder;

/**
 * This is a generated sequence class.
 */
public class AdjPoint2DModel {
  private final AdjCoordinateValueModel y;

  private final AdjCoordinateValueModel x;

  public AdjPoint2DModel(AdjCoordinateValueModel y, AdjCoordinateValueModel x) {
    this.y = y;
    this.x = x;
  }

  public AdjPoint2DBuilder builder() {
    return new AdjPoint2DBuilder().from(this);
  }

  public AdjCoordinateValueModel getY() {
    return this.y;
  }

  public AdjCoordinateValueModel getX() {
    return this.x;
  }
}
