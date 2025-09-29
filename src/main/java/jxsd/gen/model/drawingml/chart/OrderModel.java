package jxsd.gen.model.drawingml.chart;

import jxsd.gen.builder.drawingml.chart.OrderBuilder;

/**
 * This is a generated sequence class.
 */
public class OrderModel {
  private final short val;

  public OrderModel(short val) {
    this.val = val;
  }

  public OrderBuilder builder() {
    return new OrderBuilder().from(this);
  }

  public short getVal() {
    return this.val;
  }
}
