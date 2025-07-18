package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_SecondPieSizeModel;

public class ST_SecondPieSizeConverter {
  private ST_SecondPieSizeConverter() {
  }

  public static ST_SecondPieSizeModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_SecondPieSizeModel(value);
  }

  public static Long toDocx4J(ST_SecondPieSizeModel value) {
    return null;
  }
}
