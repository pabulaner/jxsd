package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageModel;

public class FixedPercentageBuilder {
  private FixedPercentageModel val;

  public FixedPercentageBuilder() {
  }

  public FixedPercentageBuilder setVal(FixedPercentageModel val) {
    this.val = val;
    return this;
  }

  public FixedPercentageModel build() {
    return new FixedPercentageModel(this.val);
  }

  public FixedPercentageBuilder from(FixedPercentageModel value) {
    this.val = value.getVal();
    return this;
  }
}
