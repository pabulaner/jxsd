package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OrderModel;

public class OrderBuilder {
  private OrderModel val;

  public OrderBuilder() {
  }

  public OrderBuilder setVal(OrderModel val) {
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
