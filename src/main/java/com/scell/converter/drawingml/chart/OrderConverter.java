package com.scell.converter.drawingml.chart;

import com.scell.model.drawingml.chart.OrderModel;
import org.docx4j.dml.chart.CTOrder;

public class OrderConverter {
  private OrderConverter() {
  }

  public static OrderModel fromDocx4J(CTOrder value) {
    if (value == null) return null;
    return new OrderModel(OrderConverter.fromDocx4J(value.getVal()));
  }
}
