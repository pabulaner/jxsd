package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedPercentageModel;

public class PositiveFixedPercentageBuilder {
  private PositiveFixedPercentageModel val;

  public PositiveFixedPercentageBuilder() {
  }

  public PositiveFixedPercentageBuilder setVal(PositiveFixedPercentageModel val) {
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
