package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PercentageValueModel;

public class PercentageValueBuilder {
  private int value;

  public PercentageValueBuilder() {
  }

  public PercentageValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public PercentageValueBuilder from(PercentageValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PercentageValueModel build() {
    return new PercentageValueModel(this.value);
  }
}
