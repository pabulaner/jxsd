package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TickMarkModel;

public class TickMarkBuilder {
  private TickMarkModel val;

  public TickMarkBuilder() {
  }

  public TickMarkBuilder setVal(TickMarkModel val) {
    this.val = val;
    return this;
  }

  public TickMarkModel build() {
    return new TickMarkModel(this.val);
  }

  public TickMarkBuilder from(TickMarkModel value) {
    this.val = value.getVal();
    return this;
  }
}
