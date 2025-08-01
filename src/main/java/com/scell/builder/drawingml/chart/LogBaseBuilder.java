package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LogBaseModel;
import com.scell.model.drawingml.chart.LogBaseValueModel;

public class LogBaseBuilder {
  private LogBaseValueModel val;

  public LogBaseBuilder() {
  }

  public LogBaseBuilder setVal(LogBaseValueModel val) {
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
