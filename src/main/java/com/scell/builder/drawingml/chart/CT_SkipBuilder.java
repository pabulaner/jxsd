package com.scell.builder.drawingml.chart;

import com.scell.model.drawingml.chart.CT_SkipModel;
import com.scell.model.drawingml.chart.ST_SkipModel;

public class CT_SkipBuilder {
  private ST_SkipModel val;

  public CT_SkipBuilder() {
  }

  public CT_SkipBuilder setVal(ST_SkipModel val) {
    this.val = val;
    return this;
  }

  public CT_SkipModel build() {
    return new CT_SkipModel(this.val);
  }

  public CT_SkipBuilder from(CT_SkipModel value) {
    this.val = value.getVal();
    return this;
  }
}
