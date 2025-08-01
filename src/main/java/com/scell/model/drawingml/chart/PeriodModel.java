package com.scell.model.drawingml.chart;

public class PeriodModel {
  private final PeriodValueModel val;

  public PeriodModel(PeriodValueModel val) {
    this.val = val;
  }

  public PeriodValueModel getVal() {
    return this.val;
  }
}
