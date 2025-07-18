package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_BarGroupingModel;
import com.scell.model.drawingml.chart.ST_BarGroupingModel;

public class CT_BarGroupingBuilder {
  private ST_BarGroupingModel val;

  public CT_BarGroupingBuilder() {
  }

  public CT_BarGroupingBuilder setVal(ST_BarGroupingModel val) {
    this.val = val;
    return this;
  }

  public CT_BarGroupingModel build() {
    return new CT_BarGroupingModel(this.val);
  }

  public CT_BarGroupingBuilder from(CT_BarGroupingModel value) {
    this.val = value.getVal();
    return this;
  }
}
