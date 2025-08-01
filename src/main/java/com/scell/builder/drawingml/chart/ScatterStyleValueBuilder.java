package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ScatterStyleValueModel;

public class ScatterStyleValueBuilder {
  private ScatterStyleValueModel value;

  public ScatterStyleValueBuilder() {
    this.value = null;
  }

  public ScatterStyleValueBuilder from(ScatterStyleValueModel value) {
    this.value = value;
    return this;
  }

  public ScatterStyleValueModel build() {
    return this.value;
  }

  public ScatterStyleValueBuilder setValue(ScatterStyleValueModel value) {
    this.value = value;
    return this;
  }
}
