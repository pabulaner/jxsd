package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TickMarkValueModel;

public class TickMarkValueBuilder {
  private TickMarkValueModel value;

  public TickMarkValueBuilder() {
    this.value = null;
  }

  public TickMarkValueBuilder from(TickMarkValueModel value) {
    this.value = value;
    return this;
  }

  public TickMarkValueModel build() {
    return this.value;
  }

  public TickMarkValueBuilder setValue(TickMarkValueModel value) {
    this.value = value;
    return this;
  }
}
