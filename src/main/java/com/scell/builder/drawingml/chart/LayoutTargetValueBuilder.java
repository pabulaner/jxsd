package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutTargetValueModel;

public class LayoutTargetValueBuilder {
  private LayoutTargetValueModel value;

  public LayoutTargetValueBuilder() {
    this.value = null;
  }

  public LayoutTargetValueBuilder from(LayoutTargetValueModel value) {
    this.value = value;
    return this;
  }

  public LayoutTargetValueModel build() {
    return this.value;
  }

  public LayoutTargetValueBuilder setValue(LayoutTargetValueModel value) {
    this.value = value;
    return this;
  }
}
