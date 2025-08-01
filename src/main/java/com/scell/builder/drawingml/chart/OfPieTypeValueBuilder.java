package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OfPieTypeValueModel;

public class OfPieTypeValueBuilder {
  private OfPieTypeValueModel value;

  public OfPieTypeValueBuilder() {
    this.value = null;
  }

  public OfPieTypeValueBuilder from(OfPieTypeValueModel value) {
    this.value = value;
    return this;
  }

  public OfPieTypeValueModel build() {
    return this.value;
  }

  public OfPieTypeValueBuilder setValue(OfPieTypeValueModel value) {
    this.value = value;
    return this;
  }
}
