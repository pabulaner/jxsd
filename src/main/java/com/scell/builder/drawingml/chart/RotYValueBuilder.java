package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RotYValueModel;

public class RotYValueBuilder {
  private int value;

  public RotYValueBuilder() {
  }

  public RotYValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public RotYValueBuilder from(RotYValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public RotYValueModel build() {
    return new RotYValueModel(this.value);
  }
}
