package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TickLblPosValueModel;

public class TickLblPosValueBuilder {
  private TickLblPosValueModel value;

  public TickLblPosValueBuilder() {
    this.value = null;
  }

  public TickLblPosValueBuilder from(TickLblPosValueModel value) {
    this.value = value;
    return this;
  }

  public TickLblPosValueModel build() {
    return this.value;
  }

  public TickLblPosValueBuilder setValue(TickLblPosValueModel value) {
    this.value = value;
    return this;
  }
}
