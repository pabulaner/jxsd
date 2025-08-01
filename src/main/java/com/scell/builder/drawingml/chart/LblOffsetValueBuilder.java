package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LblOffsetValueModel;

public class LblOffsetValueBuilder {
  private int value;

  public LblOffsetValueBuilder() {
  }

  public LblOffsetValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public LblOffsetValueBuilder from(LblOffsetValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public LblOffsetValueModel build() {
    return new LblOffsetValueModel(this.value);
  }
}
