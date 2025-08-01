package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedPercentageValueModel;

public class PositiveFixedPercentageValueBuilder {
  private int value;

  public PositiveFixedPercentageValueBuilder() {
  }

  public PositiveFixedPercentageValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public PositiveFixedPercentageValueBuilder from(PositiveFixedPercentageValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PositiveFixedPercentageValueModel build() {
    return new PositiveFixedPercentageValueModel(this.value);
  }
}
