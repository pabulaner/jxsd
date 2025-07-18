package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_PerspectiveModel;

public class ST_PerspectiveConverter {
  private ST_PerspectiveConverter() {
  }

  public static ST_PerspectiveModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_PerspectiveModel(value);
  }

  public static Long toDocx4J(ST_PerspectiveModel value) {
    return null;
  }
}
