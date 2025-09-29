package jxsd.gen.builder.drawingml.chart;

import jxsd.gen.model.drawingml.chart.OrderModel;

/**
 * This is a generated sequence class.
 */
public class OrderBuilder {
  private short val;

  public OrderBuilder() {
  }

  public OrderBuilder setVal(short val) {
    this.val = val;
    return this;
  }

  public OrderBuilder from(OrderModel value) {
    this.val = value.getVal();
    return this;
  }

  public OrderModel build() {
    return new OrderModel(this.val);
  }
}
