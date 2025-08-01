package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.PeriodValueModel;

public class PeriodValueConverter {
  private PeriodValueConverter() {
  }

  public static PeriodValueModel fromDocx4J(Short value) {
    if (value == null) return null;
    return new PeriodValueModel(value);
  }
}
