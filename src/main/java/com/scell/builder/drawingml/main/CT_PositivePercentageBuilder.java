package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.CT_PositivePercentageModel;
import com.scell.model.drawingml.main.ST_PositivePercentageModel;

public class CT_PositivePercentageBuilder {
  private ST_PositivePercentageModel val;

  public CT_PositivePercentageBuilder() {
  }

  public CT_PositivePercentageBuilder setVal(ST_PositivePercentageModel val) {
    this.val = val;
    return this;
  }

  public CT_PositivePercentageModel build() {
    return new CT_PositivePercentageModel(this.val);
  }

  public CT_PositivePercentageBuilder from(CT_PositivePercentageModel value) {
    this.val = value.getVal();
    return this;
  }
}
