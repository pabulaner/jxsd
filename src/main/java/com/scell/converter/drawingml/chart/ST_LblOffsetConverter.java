package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LblOffsetModel;

public class ST_LblOffsetConverter {
  private ST_LblOffsetConverter() {
  }

  public static ST_LblOffsetModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_LblOffsetModel(value);
  }

  public static Long toDocx4J(ST_LblOffsetModel value) {
    return null;
  }
}
