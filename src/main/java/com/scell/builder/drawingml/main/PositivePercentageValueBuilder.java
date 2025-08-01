package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositivePercentageValueModel;

public class PositivePercentageValueBuilder {
  private int value;

  public PositivePercentageValueBuilder() {
  }

  public PositivePercentageValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public PositivePercentageValueBuilder from(PositivePercentageValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PositivePercentageValueModel build() {
    return new PositivePercentageValueModel(this.value);
  }
}
