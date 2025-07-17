package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LayoutTargetModel;
import com.scell.model.drawingml.chart.ST_LayoutTargetModel;

public class CT_LayoutTargetBuilder {
  private ST_LayoutTargetModel val;

  public CT_LayoutTargetBuilder() {
  }

  public CT_LayoutTargetBuilder setVal(ST_LayoutTargetModel val) {
    this.val = val;
    return this;
  }

  public CT_LayoutTargetModel build() {
    return new CT_LayoutTargetModel(this.val);
  }

  public CT_LayoutTargetBuilder from(CT_LayoutTargetModel value) {
    this.val = value.getVal();
    return this;
  }
}
