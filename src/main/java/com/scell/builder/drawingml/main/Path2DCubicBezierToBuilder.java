package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.AdjPoint2DModel;
import com.scell.model.drawingml.main.Path2DCubicBezierToModel;
import java.util.List;

public class Path2DCubicBezierToBuilder {
  private List<AdjPoint2DModel> pt;

  public Path2DCubicBezierToBuilder() {
  }

  public Path2DCubicBezierToBuilder setPt(List<AdjPoint2DModel> pt) {
    this.pt = pt;
    return this;
  }

  public Path2DCubicBezierToModel build() {
    return new Path2DCubicBezierToModel(this.pt);
  }

  public Path2DCubicBezierToBuilder from(Path2DCubicBezierToModel value) {
    this.pt = value.getPt();
    return this;
  }
}
