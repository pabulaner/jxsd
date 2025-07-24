package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositivePercentageModel;

public class PositivePercentageBuilder {
  private PositivePercentageModel val;

  public PositivePercentageBuilder() {
  }

  public PositivePercentageBuilder setVal(PositivePercentageModel val) {
    this.val = val;
    return this;
  }

  public PositivePercentageModel build() {
    return new PositivePercentageModel(this.val);
  }

  public PositivePercentageBuilder from(PositivePercentageModel value) {
    this.val = value.getVal();
    return this;
  }
}
