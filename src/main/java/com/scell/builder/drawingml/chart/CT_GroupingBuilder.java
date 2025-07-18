package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_GroupingModel;
import com.scell.model.drawingml.chart.ST_GroupingModel;

public class CT_GroupingBuilder {
  private ST_GroupingModel val;

  public CT_GroupingBuilder() {
  }

  public CT_GroupingBuilder setVal(ST_GroupingModel val) {
    this.val = val;
    return this;
  }

  public CT_GroupingModel build() {
    return new CT_GroupingModel(this.val);
  }

  public CT_GroupingBuilder from(CT_GroupingModel value) {
    this.val = value.getVal();
    return this;
  }
}
