package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.Path2DLineToBuilder;

/**
 * This is a generated sequence class.
 */
public class Path2DLineToModel {
  private final AdjPoint2DModel pt;

  public Path2DLineToModel(AdjPoint2DModel pt) {
    this.pt = pt;
  }

  public Path2DLineToBuilder builder() {
    return new Path2DLineToBuilder().from(this);
  }

  public AdjPoint2DModel getPt() {
    return this.pt;
  }
}
