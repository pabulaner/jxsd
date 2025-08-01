package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.SkipValueModel;

public class SkipValueBuilder {
  private int value;

  public SkipValueBuilder() {
  }

  public SkipValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public SkipValueBuilder from(SkipValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public SkipValueModel build() {
    return new SkipValueModel(this.value);
  }
}
