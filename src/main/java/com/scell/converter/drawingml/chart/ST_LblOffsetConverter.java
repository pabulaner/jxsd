package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_LblOffsetModel;

public class ST_LblOffsetConverter {
  private ST_LblOffsetConverter() {
  }

  public static ST_LblOffsetModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_LblOffsetModel(value);
  }

  public static Long toDocx4j(ST_LblOffsetModel value) {
    return null;
  }
}
