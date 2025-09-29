package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.AdjPoint2DModel;
import jxsd.gen.model.drawingml.main.Path2DQuadBezierToModel;

/**
 * This is a generated sequence class.
 */
public class Path2DQuadBezierToBuilder {
  private List<AdjPoint2DModel> pt;

  public Path2DQuadBezierToBuilder() {
  }

  public Path2DQuadBezierToBuilder setPt(List<AdjPoint2DModel> pt) {
    this.pt = pt;
    return this;
  }

  public Path2DQuadBezierToBuilder from(Path2DQuadBezierToModel value) {
    this.pt = value.getPt();
    return this;
  }

  public Path2DQuadBezierToModel build() {
    return new Path2DQuadBezierToModel(this.pt);
  }
}
