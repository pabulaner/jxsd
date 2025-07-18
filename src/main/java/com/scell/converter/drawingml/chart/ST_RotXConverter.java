package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_RotXModel;

public class ST_RotXConverter {
  private ST_RotXConverter() {
  }

  public static ST_RotXModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_RotXModel(value);
  }

  public static Long toDocx4J(ST_RotXModel value) {
    return null;
  }
}
