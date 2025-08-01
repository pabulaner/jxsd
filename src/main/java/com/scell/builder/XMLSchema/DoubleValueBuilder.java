package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DoubleValueModel;

public class DoubleValueBuilder {
  private double value;

  public DoubleValueBuilder() {
  }

  public DoubleValueBuilder setValue(double value) {
    this.value = value;
    return this;
  }

  public DoubleValueBuilder from(DoubleValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public DoubleValueModel build() {
    return new DoubleValueModel(this.value);
  }
}
