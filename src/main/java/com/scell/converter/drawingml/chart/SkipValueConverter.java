package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.SkipValueModel;

public class SkipValueConverter {
  private SkipValueConverter() {
  }

  public static SkipValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new SkipValueModel(value);
  }
}
