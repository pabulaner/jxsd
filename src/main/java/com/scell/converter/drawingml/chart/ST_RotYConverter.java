package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_RotYModel;

public class ST_RotYConverter {
  private ST_RotYConverter() {
  }

  public static ST_RotYModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_RotYModel(value);
  }

  public static Long toDocx4J(ST_RotYModel value) {
    return null;
  }
}
