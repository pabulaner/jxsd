package com.scell.model.drawingml.main;

import java.util.List;

public class CT_Path2DCubicBezierToModel {
  private final List<CT_AdjPoint2DModel> pt;

  public CT_Path2DCubicBezierToModel(List<CT_AdjPoint2DModel> pt) {
    this.pt = pt;
  }

  public List<CT_AdjPoint2DModel> getPt() {
    return this.pt;
  }
}
