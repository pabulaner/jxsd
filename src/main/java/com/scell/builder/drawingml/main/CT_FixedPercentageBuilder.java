package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_FixedPercentageModel;
import com.scell.model.drawingml.main.ST_FixedPercentageModel;

public class CT_FixedPercentageBuilder {
  private ST_FixedPercentageModel val;

  public CT_FixedPercentageBuilder() {
  }

  public CT_FixedPercentageBuilder setVal(ST_FixedPercentageModel val) {
    this.val = val;
    return this;
  }

  public CT_FixedPercentageModel build() {
    return new CT_FixedPercentageModel(this.val);
  }

  public CT_FixedPercentageBuilder from(CT_FixedPercentageModel value) {
    this.val = value.getVal();
    return this;
  }
}
