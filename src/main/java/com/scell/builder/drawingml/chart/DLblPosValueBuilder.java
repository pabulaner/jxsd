package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.DLblPosValueModel;

public class DLblPosValueBuilder {
  private DLblPosValueModel value;

  public DLblPosValueBuilder() {
    this.value = null;
  }

  public DLblPosValueBuilder from(DLblPosValueModel value) {
    this.value = value;
    return this;
  }

  public DLblPosValueModel build() {
    return this.value;
  }

  public DLblPosValueBuilder setValue(DLblPosValueModel value) {
    this.value = value;
    return this;
  }
}
