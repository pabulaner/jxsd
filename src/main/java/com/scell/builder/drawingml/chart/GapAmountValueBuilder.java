package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.GapAmountValueModel;

public class GapAmountValueBuilder {
  private int value;

  public GapAmountValueBuilder() {
  }

  public GapAmountValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public GapAmountValueBuilder from(GapAmountValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public GapAmountValueModel build() {
    return new GapAmountValueModel(this.value);
  }
}
