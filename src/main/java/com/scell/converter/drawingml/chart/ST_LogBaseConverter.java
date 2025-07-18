package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LogBaseModel;

public class ST_LogBaseConverter {
  private ST_LogBaseConverter() {
  }

  public static ST_LogBaseModel fromDocx4J(Double value) {
    if (value == null) return null;
    return new ST_LogBaseModel(value);
  }

  public static Double toDocx4J(ST_LogBaseModel value) {
    return null;
  }
}
