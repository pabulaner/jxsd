package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.LegendPosValueModel;

public class LegendPosValueBuilder {
  private LegendPosValueModel value;

  public LegendPosValueBuilder() {
    this.value = null;
  }

  public LegendPosValueBuilder from(LegendPosValueModel value) {
    this.value = value;
    return this;
  }

  public LegendPosValueModel build() {
    return this.value;
  }

  public LegendPosValueBuilder setValue(LegendPosValueModel value) {
    this.value = value;
    return this;
  }
}
