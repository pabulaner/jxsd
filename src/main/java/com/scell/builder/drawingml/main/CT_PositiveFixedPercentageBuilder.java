package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_PositiveFixedPercentageModel;
import com.scell.model.drawingml.main.ST_PositiveFixedPercentageModel;

public class CT_PositiveFixedPercentageBuilder {
  private ST_PositiveFixedPercentageModel val;

  public CT_PositiveFixedPercentageBuilder() {
  }

  public CT_PositiveFixedPercentageBuilder setVal(ST_PositiveFixedPercentageModel val) {
    this.val = val;
    return this;
  }

  public CT_PositiveFixedPercentageModel build() {
    return new CT_PositiveFixedPercentageModel(this.val);
  }

  public CT_PositiveFixedPercentageBuilder from(CT_PositiveFixedPercentageModel value) {
    this.val = value.getVal();
    return this;
  }
}
