package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RotYModel;
import com.scell.model.drawingml.chart.RotYValueModel;

public class RotYBuilder {
  private RotYValueModel val;

  public RotYBuilder() {
  }

  public RotYBuilder setVal(RotYValueModel val) {
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
