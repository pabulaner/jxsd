package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.BarDirValueModel;

public class BarDirValueBuilder {
  private BarDirValueModel value;

  public BarDirValueBuilder() {
    this.value = null;
  }

  public BarDirValueBuilder from(BarDirValueModel value) {
    this.value = value;
    return this;
  }

  public BarDirValueModel build() {
    return this.value;
  }

  public BarDirValueBuilder setValue(BarDirValueModel value) {
    this.value = value;
    return this;
  }
}
