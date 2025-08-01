package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.LogBaseValueModel;

public class LogBaseValueConverter {
  private LogBaseValueConverter() {
  }

  public static LogBaseValueModel fromDocx4J(Double value) {
    if (value == null) return null;
    return new LogBaseValueModel(value);
  }
}
