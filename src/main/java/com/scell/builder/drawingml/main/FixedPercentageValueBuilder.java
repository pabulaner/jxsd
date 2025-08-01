package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedPercentageValueModel;

public class FixedPercentageValueBuilder {
  private int value;

  public FixedPercentageValueBuilder() {
  }

  public FixedPercentageValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public FixedPercentageValueBuilder from(FixedPercentageValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public FixedPercentageValueModel build() {
    return new FixedPercentageValueModel(this.value);
  }
}
