package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_RotYModel;

public class ST_RotYConverter {
  private ST_RotYConverter() {
  }

  public static ST_RotYModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_RotYModel(value);
  }

  public static Long toDocx4j(ST_RotYModel value) {
    return null;
  }
}
