package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositivePercentageModel;
import com.scell.model.drawingml.main.PositivePercentageValueModel;

public class PositivePercentageBuilder {
  private PositivePercentageValueModel val;

  public PositivePercentageBuilder() {
  }

  public PositivePercentageBuilder setVal(PositivePercentageValueModel val) {
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
