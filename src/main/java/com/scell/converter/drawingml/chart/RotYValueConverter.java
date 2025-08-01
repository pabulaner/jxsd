package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.RotYValueModel;

public class RotYValueConverter {
  private RotYValueConverter() {
  }

  public static RotYValueModel fromDocx4J(Integer value) {
    if (value == null) return null;
    return new RotYValueModel(value);
  }
}
