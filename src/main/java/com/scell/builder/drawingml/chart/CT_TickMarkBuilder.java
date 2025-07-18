package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_TickMarkModel;
import com.scell.model.drawingml.chart.ST_TickMarkModel;

public class CT_TickMarkBuilder {
  private ST_TickMarkModel val;

  public CT_TickMarkBuilder() {
  }

  public CT_TickMarkBuilder setVal(ST_TickMarkModel val) {
    this.val = val;
    return this;
  }

  public CT_TickMarkModel build() {
    return new CT_TickMarkModel(this.val);
  }

  public CT_TickMarkBuilder from(CT_TickMarkModel value) {
    this.val = value.getVal();
    return this;
  }
}
