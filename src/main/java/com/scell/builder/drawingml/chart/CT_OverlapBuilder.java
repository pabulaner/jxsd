package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OverlapModel;
import com.scell.model.drawingml.chart.ST_OverlapModel;

public class CT_OverlapBuilder {
  private ST_OverlapModel val;

  public CT_OverlapBuilder() {
  }

  public CT_OverlapBuilder setVal(ST_OverlapModel val) {
    this.val = val;
    return this;
  }

  public CT_OverlapModel build() {
    return new CT_OverlapModel(this.val);
  }

  public CT_OverlapBuilder from(CT_OverlapModel value) {
    this.val = value.getVal();
    return this;
  }
}
