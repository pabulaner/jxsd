package jxsd.gen.builder.drawingml.main;

import java.util.List;
import jxsd.gen.model.drawingml.main.AdjPoint2DModel;
import jxsd.gen.model.drawingml.main.Path2DCubicBezierToModel;

/**
 * This is a generated sequence class.
 */
public class Path2DCubicBezierToBuilder {
  private List<AdjPoint2DModel> pt;

  public Path2DCubicBezierToBuilder() {
  }

  public Path2DCubicBezierToBuilder setPt(List<AdjPoint2DModel> pt) {
    this.pt = pt;
    return this;
  }

  public Path2DCubicBezierToBuilder from(Path2DCubicBezierToModel value) {
    this.pt = value.getPt();
    return this;
  }

  public Path2DCubicBezierToModel build() {
    return new Path2DCubicBezierToModel(this.pt);
  }
}
