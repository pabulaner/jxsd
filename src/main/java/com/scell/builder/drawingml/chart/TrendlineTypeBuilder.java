package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TrendlineTypeModel;
import com.scell.model.drawingml.chart.TrendlineTypeValueModel;

public class TrendlineTypeBuilder {
  private TrendlineTypeValueModel val;

  public TrendlineTypeBuilder() {
  }

  public TrendlineTypeBuilder setVal(TrendlineTypeValueModel val) {
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
