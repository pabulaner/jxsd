package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.ST_OrderModel;

public class ST_OrderBuilder {
  private Long value;

  public ST_OrderBuilder() {
    this.value = null;
  }

  public ST_OrderBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public ST_OrderBuilder from(ST_OrderModel value) {
    this.value = value.getValue();
    return this;
  }

  public ST_OrderModel build() {
    return new ST_OrderModel(this.value);
  }
}
