package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.OrderValueModel;

public class OrderValueBuilder {
  private short value;

  public OrderValueBuilder() {
  }

  public OrderValueBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public OrderValueBuilder from(OrderValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public OrderValueModel build() {
    return new OrderValueModel(this.value);
  }
}
