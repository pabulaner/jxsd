package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PercentageModel;

public class PercentageBuilder {
  private PercentageModel val;

  public PercentageBuilder() {
  }

  public PercentageBuilder setVal(PercentageModel val) {
    this.val = val;
    return this;
  }

  public PercentageModel build() {
    return new PercentageModel(this.val);
  }

  public PercentageBuilder from(PercentageModel value) {
    this.val = value.getVal();
    return this;
  }
}
