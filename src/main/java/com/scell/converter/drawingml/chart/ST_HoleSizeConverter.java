package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_HoleSizeModel;

public class ST_HoleSizeConverter {
  private ST_HoleSizeConverter() {
  }

  public static ST_HoleSizeModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_HoleSizeModel(value);
  }

  public static Long toDocx4J(ST_HoleSizeModel value) {
    return null;
  }
}
