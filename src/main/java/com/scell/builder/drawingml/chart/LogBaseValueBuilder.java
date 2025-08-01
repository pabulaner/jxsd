package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LogBaseValueModel;

public class LogBaseValueBuilder {
  private double value;

  public LogBaseValueBuilder() {
  }

  public LogBaseValueBuilder setValue(double value) {
    this.value = value;
    return this;
  }

  public LogBaseValueBuilder from(LogBaseValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public LogBaseValueModel build() {
    return new LogBaseValueModel(this.value);
  }
}
