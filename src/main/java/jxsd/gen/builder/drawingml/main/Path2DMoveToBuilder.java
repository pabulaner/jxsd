package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AdjPoint2DModel;
import jxsd.gen.model.drawingml.main.Path2DMoveToModel;

/**
 * This is a generated sequence class.
 */
public class Path2DMoveToBuilder {
  private AdjPoint2DModel pt;

  public Path2DMoveToBuilder() {
  }

  public Path2DMoveToBuilder setPt(AdjPoint2DModel pt) {
    this.pt = pt;
    return this;
  }

  public Path2DMoveToBuilder from(Path2DMoveToModel value) {
    this.pt = value.getPt();
    return this;
  }

  public Path2DMoveToModel build() {
    return new Path2DMoveToModel(this.pt);
  }
}
