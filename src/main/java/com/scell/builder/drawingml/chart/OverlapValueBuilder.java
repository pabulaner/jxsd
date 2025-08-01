package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OverlapValueModel;

public class OverlapValueBuilder {
  private byte value;

  public OverlapValueBuilder() {
  }

  public OverlapValueBuilder setValue(byte value) {
    this.value = value;
    return this;
  }

  public OverlapValueBuilder from(OverlapValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public OverlapValueModel build() {
    return new OverlapValueModel(this.value);
  }
}
