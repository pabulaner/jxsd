package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SplitTypeModel;
import com.scell.model.drawingml.chart.ST_SplitTypeModel;

public class CT_SplitTypeBuilder {
  private ST_SplitTypeModel val;

  public CT_SplitTypeBuilder() {
  }

  public CT_SplitTypeBuilder setVal(ST_SplitTypeModel val) {
    this.val = val;
    return this;
  }

  public CT_SplitTypeModel build() {
    return new CT_SplitTypeModel(this.val);
  }

  public CT_SplitTypeBuilder from(CT_SplitTypeModel value) {
    this.val = value.getVal();
    return this;
  }
}
