package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjPoint2DModel;
import com.scell.model.drawingml.main.CT_Path2DQuadBezierToModel;
import java.util.List;

public class CT_Path2DQuadBezierToBuilder {
  private List<CT_AdjPoint2DModel> pt;

  public CT_Path2DQuadBezierToBuilder() {
  }

  public CT_Path2DQuadBezierToBuilder setPt(List<CT_AdjPoint2DModel> pt) {
    this.pt = pt;
    return this;
  }

  public CT_Path2DQuadBezierToModel build() {
    return new CT_Path2DQuadBezierToModel(this.pt);
  }

  public CT_Path2DQuadBezierToBuilder from(CT_Path2DQuadBezierToModel value) {
    this.pt = value.getPt();
    return this;
  }
}
