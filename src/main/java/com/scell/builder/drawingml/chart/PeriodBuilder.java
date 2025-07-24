package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PeriodModel;

public class PeriodBuilder {
  private PeriodModel val;

  public PeriodBuilder() {
  }

  public PeriodBuilder setVal(PeriodModel val) {
    this.val = val;
    return this;
  }

  public PeriodModel build() {
    return new PeriodModel(this.val);
  }

  public PeriodBuilder from(PeriodModel value) {
    this.val = value.getVal();
    return this;
  }
}
