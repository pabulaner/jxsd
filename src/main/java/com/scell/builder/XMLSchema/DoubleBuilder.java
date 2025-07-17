package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DoubleModel;

public class DoubleBuilder {
  private Double value;

  public DoubleBuilder() {
    this.value = null;
  }

  public DoubleBuilder setValue(Double value) {
    this.value = value;
    return this;
  }

  public DoubleBuilder from(DoubleModel value) {
    this.value = value.getValue();
    return this;
  }

  public DoubleModel build() {
    return new DoubleModel(this.value);
  }
}
