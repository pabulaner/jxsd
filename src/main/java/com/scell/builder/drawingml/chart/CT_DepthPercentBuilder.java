package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_DepthPercentModel;
import com.scell.model.drawingml.chart.ST_DepthPercentModel;

public class CT_DepthPercentBuilder {
  private ST_DepthPercentModel val;

  public CT_DepthPercentBuilder() {
  }

  public CT_DepthPercentBuilder setVal(ST_DepthPercentModel val) {
    this.val = val;
    return this;
  }

  public CT_DepthPercentModel build() {
    return new CT_DepthPercentModel(this.val);
  }

  public CT_DepthPercentBuilder from(CT_DepthPercentModel value) {
    this.val = value.getVal();
    return this;
  }
}
