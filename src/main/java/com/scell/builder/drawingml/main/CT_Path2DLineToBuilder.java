package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjPoint2DModel;
import com.scell.model.drawingml.main.CT_Path2DLineToModel;

public class CT_Path2DLineToBuilder {
  private CT_AdjPoint2DModel pt;

  public CT_Path2DLineToBuilder() {
  }

  public CT_Path2DLineToBuilder setPt(CT_AdjPoint2DModel pt) {
    this.pt = pt;
    return this;
  }

  public CT_Path2DLineToModel build() {
    return new CT_Path2DLineToModel(this.pt);
  }

  public CT_Path2DLineToBuilder from(CT_Path2DLineToModel value) {
    this.pt = value.getPt();
    return this;
  }
}
