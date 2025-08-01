package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LblAlgnValueModel;

public class LblAlgnValueBuilder {
  private LblAlgnValueModel value;

  public LblAlgnValueBuilder() {
    this.value = null;
  }

  public LblAlgnValueBuilder from(LblAlgnValueModel value) {
    this.value = value;
    return this;
  }

  public LblAlgnValueModel build() {
    return this.value;
  }

  public LblAlgnValueBuilder setValue(LblAlgnValueModel value) {
    this.value = value;
    return this;
  }
}
