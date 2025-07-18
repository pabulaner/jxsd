package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PeriodModel;

public class ST_PeriodConverter {
  private ST_PeriodConverter() {
  }

  public static ST_PeriodModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_PeriodModel(value);
  }

  public static Long toDocx4J(ST_PeriodModel value) {
    return null;
  }
}
