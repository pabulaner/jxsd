package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TrendlineTypeModel;

public class TrendlineTypeBuilder {
  private TrendlineTypeModel val;

  public TrendlineTypeBuilder() {
  }

  public TrendlineTypeBuilder setVal(TrendlineTypeModel val) {
    this.val = val;
    return this;
  }

  public TrendlineTypeModel build() {
    return new TrendlineTypeModel(this.val);
  }

  public TrendlineTypeBuilder from(TrendlineTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
