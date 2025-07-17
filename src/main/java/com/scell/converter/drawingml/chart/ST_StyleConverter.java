package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_StyleModel;

public class ST_StyleConverter {
  private ST_StyleConverter() {
  }

  public static ST_StyleModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_StyleModel(value);
  }

  public static Long toDocx4j(ST_StyleModel value) {
    return null;
  }
}
