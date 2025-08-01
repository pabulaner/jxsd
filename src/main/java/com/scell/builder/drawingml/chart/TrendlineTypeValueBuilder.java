package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.TrendlineTypeValueModel;

public class TrendlineTypeValueBuilder {
  private TrendlineTypeValueModel value;

  public TrendlineTypeValueBuilder() {
    this.value = null;
  }

  public TrendlineTypeValueBuilder from(TrendlineTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TrendlineTypeValueModel build() {
    return this.value;
  }

  public TrendlineTypeValueBuilder setValue(TrendlineTypeValueModel value) {
    this.value = value;
    return this;
  }
}
