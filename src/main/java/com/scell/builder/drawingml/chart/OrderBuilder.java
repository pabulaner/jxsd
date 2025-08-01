package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OrderModel;
import com.scell.model.drawingml.chart.OrderValueModel;

public class OrderBuilder {
  private OrderValueModel val;

  public OrderBuilder() {
  }

  public OrderBuilder setVal(OrderValueModel val) {
    this.val = val;
    return this;
  }

  public OrderModel build() {
    return new OrderModel(this.val);
  }

  public OrderBuilder from(OrderModel value) {
    this.val = value.getVal();
    return this;
  }
}
