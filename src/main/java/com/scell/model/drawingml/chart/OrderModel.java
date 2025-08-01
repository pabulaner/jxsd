package com.scell.model.drawingml.chart;

public class OrderModel {
  private final OrderValueModel val;

  public OrderModel(OrderValueModel val) {
    this.val = val;
  }

  public OrderValueModel getVal() {
    return this.val;
  }
}
