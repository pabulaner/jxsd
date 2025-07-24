package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RotXModel;

public class RotXBuilder {
  private RotXModel val;

  public RotXBuilder() {
  }

  public RotXBuilder setVal(RotXModel val) {
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
