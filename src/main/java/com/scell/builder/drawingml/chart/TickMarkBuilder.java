package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TickMarkModel;
import com.scell.model.drawingml.chart.TickMarkValueModel;

public class TickMarkBuilder {
  private TickMarkValueModel val;

  public TickMarkBuilder() {
  }

  public TickMarkBuilder setVal(TickMarkValueModel val) {
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
