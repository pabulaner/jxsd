package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PeriodValueModel;

public class PeriodValueBuilder {
  private short value;

  public PeriodValueBuilder() {
  }

  public PeriodValueBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public PeriodValueBuilder from(PeriodValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PeriodValueModel build() {
    return new PeriodValueModel(this.value);
  }
}
