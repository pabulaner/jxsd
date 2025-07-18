package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_AdjPoint2DModel;
import com.scell.model.drawingml.main.CT_Path2DMoveToModel;

public class CT_Path2DMoveToBuilder {
  private CT_AdjPoint2DModel pt;

  public CT_Path2DMoveToBuilder() {
  }

  public CT_Path2DMoveToBuilder setPt(CT_AdjPoint2DModel pt) {
    this.pt = pt;
    return this;
  }

  public CT_Path2DMoveToModel build() {
    return new CT_Path2DMoveToModel(this.pt);
  }

  public CT_Path2DMoveToBuilder from(CT_Path2DMoveToModel value) {
    this.pt = value.getPt();
    return this;
  }
}
