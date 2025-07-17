package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjPoint2DModel;
import com.scell.model.drawingml.main.CT_Path2DCubicBezierToModel;
import java.util.List;

public class CT_Path2DCubicBezierToBuilder {
  private List<CT_AdjPoint2DModel> pt;

  public CT_Path2DCubicBezierToBuilder() {
  }

  public CT_Path2DCubicBezierToBuilder setPt(List<CT_AdjPoint2DModel> pt) {
    this.pt = pt;
    return this;
  }

  public CT_Path2DCubicBezierToModel build() {
    return new CT_Path2DCubicBezierToModel(this.pt);
  }

  public CT_Path2DCubicBezierToBuilder from(CT_Path2DCubicBezierToModel value) {
    this.pt = value.getPt();
    return this;
  }
}
