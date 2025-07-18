package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_OrderModel;
import com.scell.model.drawingml.chart.ST_OrderModel;

public class CT_OrderBuilder {
  private ST_OrderModel val;

  public CT_OrderBuilder() {
  }

  public CT_OrderBuilder setVal(ST_OrderModel val) {
    this.val = val;
    return this;
  }

  public CT_OrderModel build() {
    return new CT_OrderModel(this.val);
  }

  public CT_OrderBuilder from(CT_OrderModel value) {
    this.val = value.getVal();
    return this;
  }
}
