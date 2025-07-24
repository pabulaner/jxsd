package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LogBaseModel;

public class LogBaseBuilder {
  private LogBaseModel val;

  public LogBaseBuilder() {
  }

  public LogBaseBuilder setVal(LogBaseModel val) {
    this.val = val;
    return this;
  }

  public LogBaseModel build() {
    return new LogBaseModel(this.val);
  }

  public LogBaseBuilder from(LogBaseModel value) {
    this.val = value.getVal();
    return this;
  }
}
