package com.scell.model.drawingml.main;

import java.util.List;

public class Path2DCubicBezierToModel {
  private final List<AdjPoint2DModel> pt;

  public Path2DCubicBezierToModel(List<AdjPoint2DModel> pt) {
    this.pt = pt;
  }

  public List<AdjPoint2DModel> getPt() {
    return this.pt;
  }
}
