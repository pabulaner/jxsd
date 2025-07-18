package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_MarkerSizeModel;

public class ST_MarkerSizeConverter {
  private ST_MarkerSizeConverter() {
  }

  public static ST_MarkerSizeModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_MarkerSizeModel(value);
  }

  public static Long toDocx4J(ST_MarkerSizeModel value) {
    return null;
  }
}
