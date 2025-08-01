package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.AxisUnitValueModel;

public class AxisUnitValueConverter {
  private AxisUnitValueConverter() {
  }

  public static AxisUnitValueModel fromDocx4J(Double value) {
    if (value == null) return null;
    return new AxisUnitValueModel(value);
  }
}
