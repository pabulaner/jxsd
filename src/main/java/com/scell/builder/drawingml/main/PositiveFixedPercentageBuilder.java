package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedPercentageModel;
import com.scell.model.drawingml.main.PositiveFixedPercentageValueModel;

public class PositiveFixedPercentageBuilder {
  private PositiveFixedPercentageValueModel val;

  public PositiveFixedPercentageBuilder() {
  }

  public PositiveFixedPercentageBuilder setVal(PositiveFixedPercentageValueModel val) {
    this.val = val;
    return this;
  }

  public PositiveFixedPercentageModel build() {
    return new PositiveFixedPercentageModel(this.val);
  }

  public PositiveFixedPercentageBuilder from(PositiveFixedPercentageModel value) {
    this.val = value.getVal();
    return this;
  }
}
