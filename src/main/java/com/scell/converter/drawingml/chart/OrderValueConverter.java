package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.OrderValueModel;

public class OrderValueConverter {
  private OrderValueConverter() {
  }

  public static OrderValueModel fromDocx4J(Short value) {
    if (value == null) return null;
    return new OrderValueModel(value);
  }
}
