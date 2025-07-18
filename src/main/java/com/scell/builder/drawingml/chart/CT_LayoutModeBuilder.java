package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_LayoutModeModel;
import com.scell.model.drawingml.chart.ST_LayoutModeModel;

public class CT_LayoutModeBuilder {
  private ST_LayoutModeModel val;

  public CT_LayoutModeBuilder() {
  }

  public CT_LayoutModeBuilder setVal(ST_LayoutModeModel val) {
    this.val = val;
    return this;
  }

  public CT_LayoutModeModel build() {
    return new CT_LayoutModeModel(this.val);
  }

  public CT_LayoutModeBuilder from(CT_LayoutModeModel value) {
    this.val = value.getVal();
    return this;
  }
}
