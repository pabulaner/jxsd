package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DepthPercentValueModel;

public class DepthPercentValueBuilder {
  private int value;

  public DepthPercentValueBuilder() {
  }

  public DepthPercentValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public DepthPercentValueBuilder from(DepthPercentValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public DepthPercentValueModel build() {
    return new DepthPercentValueModel(this.value);
  }
}
