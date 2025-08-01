package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.RotXValueModel;

public class RotXValueBuilder {
  private byte value;

  public RotXValueBuilder() {
  }

  public RotXValueBuilder setValue(byte value) {
    this.value = value;
    return this;
  }

  public RotXValueBuilder from(RotXValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public RotXValueModel build() {
    return new RotXValueModel(this.value);
  }
}
