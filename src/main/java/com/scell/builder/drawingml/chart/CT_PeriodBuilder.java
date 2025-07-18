package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_PeriodModel;
import com.scell.model.drawingml.chart.ST_PeriodModel;

public class CT_PeriodBuilder {
  private ST_PeriodModel val;

  public CT_PeriodBuilder() {
  }

  public CT_PeriodBuilder setVal(ST_PeriodModel val) {
    this.val = val;
    return this;
  }

  public CT_PeriodModel build() {
    return new CT_PeriodModel(this.val);
  }

  public CT_PeriodBuilder from(CT_PeriodModel value) {
    this.val = value.getVal();
    return this;
  }
}
