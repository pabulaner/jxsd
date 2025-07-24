package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RotYModel;

public class RotYBuilder {
  private RotYModel val;

  public RotYBuilder() {
  }

  public RotYBuilder setVal(RotYModel val) {
    this.val = val;
    return this;
  }

  public RotYModel build() {
    return new RotYModel(this.val);
  }

  public RotYBuilder from(RotYModel value) {
    this.val = value.getVal();
    return this;
  }
}
