package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.ST_OrderModel;

public class ST_OrderConverter {
  private ST_OrderConverter() {
  }

  public static ST_OrderModel fromDocx4J(Long value) {
    if (value == null) return null;
    return new ST_OrderModel(value);
  }

  public static Long toDocx4J(ST_OrderModel value) {
    return null;
  }
}
