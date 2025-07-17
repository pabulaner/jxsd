package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_GapAmountModel;

public class ST_GapAmountConverter {
  private ST_GapAmountConverter() {
  }

  public static ST_GapAmountModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_GapAmountModel(value);
  }

  public static Long toDocx4j(ST_GapAmountModel value) {
    return null;
  }
}
