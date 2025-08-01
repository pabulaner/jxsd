package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PercentageModel;
import com.scell.model.drawingml.main.PercentageValueModel;

public class PercentageBuilder {
  private PercentageValueModel val;

  public PercentageBuilder() {
  }

  public PercentageBuilder setVal(PercentageValueModel val) {
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
