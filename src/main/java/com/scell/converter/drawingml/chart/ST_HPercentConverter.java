package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_HPercentModel;

public class ST_HPercentConverter {
  private ST_HPercentConverter() {
  }

  public static ST_HPercentModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_HPercentModel(value);
  }

  public static Long toDocx4j(ST_HPercentModel value) {
    return null;
  }
}
