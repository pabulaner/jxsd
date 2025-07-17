package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_AxisUnitModel;

public class ST_AxisUnitConverter {
  private ST_AxisUnitConverter() {
  }

  public static ST_AxisUnitModel fromDocx4j(Double value) {
    if (value == null) return null;
    return new ST_AxisUnitModel(value);
  }

  public static Double toDocx4j(ST_AxisUnitModel value) {
    return null;
  }
}
