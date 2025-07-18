package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_DepthPercentModel;

public class ST_DepthPercentConverter {
  private ST_DepthPercentConverter() {
  }

  public static ST_DepthPercentModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_DepthPercentModel(value);
  }

  public static Long toDocx4J(ST_DepthPercentModel value) {
    return null;
  }
}
