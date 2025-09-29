package jxsd.gen.model.drawingml.main;

import jxsd.gen.builder.drawingml.main.Path2DMoveToBuilder;

/**
 * This is a generated sequence class.
 */
public class Path2DMoveToModel {
  private final AdjPoint2DModel pt;

  public Path2DMoveToModel(AdjPoint2DModel pt) {
    this.pt = pt;
  }

  public Path2DMoveToBuilder builder() {
    return new Path2DMoveToBuilder().from(this);
  }

  public AdjPoint2DModel getPt() {
    return this.pt;
  }
}
