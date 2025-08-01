package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.FixedAngleValueModel;

public class FixedAngleValueBuilder {
  private int value;

  public FixedAngleValueBuilder() {
  }

  public FixedAngleValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public FixedAngleValueBuilder from(FixedAngleValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public FixedAngleValueModel build() {
    return new FixedAngleValueModel(this.value);
  }
}
