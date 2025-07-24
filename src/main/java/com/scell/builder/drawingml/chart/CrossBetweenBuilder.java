package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CrossBetweenModel;

public class CrossBetweenBuilder {
  private CrossBetweenModel val;

  public CrossBetweenBuilder() {
  }

  public CrossBetweenBuilder setVal(CrossBetweenModel val) {
    this.val = val;
    return this;
  }

  public CrossBetweenModel build() {
    return new CrossBetweenModel(this.val);
  }

  public CrossBetweenBuilder from(CrossBetweenModel value) {
    this.val = value.getVal();
    return this;
  }
}
