package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_StyleModel;
import com.scell.model.drawingml.chart.ST_StyleModel;

public class CT_StyleBuilder {
  private ST_StyleModel val;

  public CT_StyleBuilder() {
  }

  public CT_StyleBuilder setVal(ST_StyleModel val) {
    this.val = val;
    return this;
  }

  public CT_StyleModel build() {
    return new CT_StyleModel(this.val);
  }

  public CT_StyleBuilder from(CT_StyleModel value) {
    this.val = value.getVal();
    return this;
  }
}
