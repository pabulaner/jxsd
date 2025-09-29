package jxsd.gen.model.drawingml.main;

import java.util.List;
import jxsd.gen.builder.drawingml.main.Path2DCubicBezierToBuilder;

/**
 * This is a generated sequence class.
 */
public class Path2DCubicBezierToModel {
  private final List<AdjPoint2DModel> pt;

  public Path2DCubicBezierToModel(List<AdjPoint2DModel> pt) {
    this.pt = pt;
  }

  public Path2DCubicBezierToBuilder builder() {
    return new Path2DCubicBezierToBuilder().from(this);
  }

  public List<AdjPoint2DModel> getPt() {
    return this.pt;
  }
}
