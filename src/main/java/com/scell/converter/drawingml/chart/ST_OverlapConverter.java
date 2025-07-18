package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_OverlapModel;

public class ST_OverlapConverter {
  private ST_OverlapConverter() {
  }

  public static ST_OverlapModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_OverlapModel(value);
  }

  public static Long toDocx4J(ST_OverlapModel value) {
    return null;
  }
}
