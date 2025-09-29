package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.Path2DQuadBezierToBuilder;

/**
 * This is a generated sequence class.
 */
public class Path2DQuadBezierToModel {
  private final List<AdjPoint2DModel> pt;

  public Path2DQuadBezierToModel(List<AdjPoint2DModel> pt) {
    this.pt = pt;
  }

  public Path2DQuadBezierToBuilder builder() {
    return new Path2DQuadBezierToBuilder().from(this);
  }

  public List<AdjPoint2DModel> getPt() {
    return this.pt;
  }
}
