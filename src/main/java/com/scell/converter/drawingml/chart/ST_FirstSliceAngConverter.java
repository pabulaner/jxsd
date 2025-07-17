package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_FirstSliceAngModel;

public class ST_FirstSliceAngConverter {
  private ST_FirstSliceAngConverter() {
  }

  public static ST_FirstSliceAngModel fromDocx4j(Long value) {
    if (value == null) return null;
    return new ST_FirstSliceAngModel(value);
  }

  public static Long toDocx4j(ST_FirstSliceAngModel value) {
    return null;
  }
}
