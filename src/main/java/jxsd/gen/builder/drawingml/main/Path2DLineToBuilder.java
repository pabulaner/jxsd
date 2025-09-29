package jxsd.gen.builder.drawingml.main;

import jxsd.gen.model.drawingml.main.AdjPoint2DModel;
import jxsd.gen.model.drawingml.main.Path2DLineToModel;

/**
 * This is a generated sequence class.
 */
public class Path2DLineToBuilder {
  private AdjPoint2DModel pt;

  public Path2DLineToBuilder() {
  }

  public Path2DLineToBuilder setPt(AdjPoint2DModel pt) {
    this.pt = pt;
    return this;
  }

  public Path2DLineToBuilder from(Path2DLineToModel value) {
    this.pt = value.getPt();
    return this;
  }

  public Path2DLineToModel build() {
    return new Path2DLineToModel(this.pt);
  }
}
