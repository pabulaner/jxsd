package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageModel;
import com.scell.model.drawingml.main.FixedPercentageValueModel;

public class FixedPercentageBuilder {
  private FixedPercentageValueModel val;

  public FixedPercentageBuilder() {
  }

  public FixedPercentageBuilder setVal(FixedPercentageValueModel val) {
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
