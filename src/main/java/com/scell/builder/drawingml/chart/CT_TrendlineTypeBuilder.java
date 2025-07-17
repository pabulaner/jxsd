package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TrendlineTypeModel;
import com.scell.model.drawingml.chart.ST_TrendlineTypeModel;

public class CT_TrendlineTypeBuilder {
  private ST_TrendlineTypeModel val;

  public CT_TrendlineTypeBuilder() {
  }

  public CT_TrendlineTypeBuilder setVal(ST_TrendlineTypeModel val) {
    this.val = val;
    return this;
  }

  public CT_TrendlineTypeModel build() {
    return new CT_TrendlineTypeModel(this.val);
  }

  public CT_TrendlineTypeBuilder from(CT_TrendlineTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
