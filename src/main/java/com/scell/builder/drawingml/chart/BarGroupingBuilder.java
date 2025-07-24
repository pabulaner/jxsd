package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BarGroupingModel;

public class BarGroupingBuilder {
  private BarGroupingModel val;

  public BarGroupingBuilder() {
  }

  public BarGroupingBuilder setVal(BarGroupingModel val) {
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
