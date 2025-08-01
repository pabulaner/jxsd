package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.PeriodModel;
import com.scell.model.drawingml.chart.PeriodValueModel;

public class PeriodBuilder {
  private PeriodValueModel val;

  public PeriodBuilder() {
  }

  public PeriodBuilder setVal(PeriodValueModel val) {
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
