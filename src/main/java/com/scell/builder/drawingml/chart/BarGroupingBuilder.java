package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BarGroupingModel;
import com.scell.model.drawingml.chart.BarGroupingValueModel;

public class BarGroupingBuilder {
  private BarGroupingValueModel val;

  public BarGroupingBuilder() {
  }

  public BarGroupingBuilder setVal(BarGroupingValueModel val) {
    this.val = val;
    return this;
  }

  public BarGroupingModel build() {
    return new BarGroupingModel(this.val);
  }

  public BarGroupingBuilder from(BarGroupingModel value) {
    this.val = value.getVal();
    return this;
  }
}
