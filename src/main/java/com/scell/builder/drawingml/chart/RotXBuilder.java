package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RotXModel;
import com.scell.model.drawingml.chart.RotXValueModel;

public class RotXBuilder {
  private RotXValueModel val;

  public RotXBuilder() {
  }

  public RotXBuilder setVal(RotXValueModel val) {
    this.val = val;
    return this;
  }

  public RotXModel build() {
    return new RotXModel(this.val);
  }

  public RotXBuilder from(RotXModel value) {
    this.val = value.getVal();
    return this;
  }
}
