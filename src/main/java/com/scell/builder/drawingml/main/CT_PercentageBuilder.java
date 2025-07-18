package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_PercentageModel;
import com.scell.model.drawingml.main.ST_PercentageModel;

public class CT_PercentageBuilder {
  private ST_PercentageModel val;

  public CT_PercentageBuilder() {
  }

  public CT_PercentageBuilder setVal(ST_PercentageModel val) {
    this.val = val;
    return this;
  }

  public CT_PercentageModel build() {
    return new CT_PercentageModel(this.val);
  }

  public CT_PercentageBuilder from(CT_PercentageModel value) {
    this.val = value.getVal();
    return this;
  }
}
