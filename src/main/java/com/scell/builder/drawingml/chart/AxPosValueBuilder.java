package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.AxPosValueModel;

public class AxPosValueBuilder {
  private AxPosValueModel value;

  public AxPosValueBuilder() {
    this.value = null;
  }

  public AxPosValueBuilder from(AxPosValueModel value) {
    this.value = value;
    return this;
  }

  public AxPosValueModel build() {
    return this.value;
  }

  public AxPosValueBuilder setValue(AxPosValueModel value) {
    this.value = value;
    return this;
  }
}
