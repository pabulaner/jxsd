package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LayoutModeValueModel;

public class LayoutModeValueBuilder {
  private LayoutModeValueModel value;

  public LayoutModeValueBuilder() {
    this.value = null;
  }

  public LayoutModeValueBuilder from(LayoutModeValueModel value) {
    this.value = value;
    return this;
  }

  public LayoutModeValueModel build() {
    return this.value;
  }

  public LayoutModeValueBuilder setValue(LayoutModeValueModel value) {
    this.value = value;
    return this;
  }
}
