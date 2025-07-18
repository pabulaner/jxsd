package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_SkipModel;

public class ST_SkipConverter {
  private ST_SkipConverter() {
  }

  public static ST_SkipModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_SkipModel(value);
  }

  public static Long toDocx4J(ST_SkipModel value) {
    return null;
  }
}
