package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PositiveFixedAngleValueModel;

public class PositiveFixedAngleValueBuilder {
  private int value;

  public PositiveFixedAngleValueBuilder() {
  }

  public PositiveFixedAngleValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public PositiveFixedAngleValueBuilder from(PositiveFixedAngleValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PositiveFixedAngleValueModel build() {
    return new PositiveFixedAngleValueModel(this.value);
  }
}
