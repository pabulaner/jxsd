package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BarGroupingValueModel;

public class BarGroupingValueBuilder {
  private BarGroupingValueModel value;

  public BarGroupingValueBuilder() {
    this.value = null;
  }

  public BarGroupingValueBuilder from(BarGroupingValueModel value) {
    this.value = value;
    return this;
  }

  public BarGroupingValueModel build() {
    return this.value;
  }

  public BarGroupingValueBuilder setValue(BarGroupingValueModel value) {
    this.value = value;
    return this;
  }
}
