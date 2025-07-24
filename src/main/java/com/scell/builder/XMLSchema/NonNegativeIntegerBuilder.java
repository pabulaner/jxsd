package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NonNegativeIntegerModel;

public class NonNegativeIntegerBuilder {
  private long value;

  public NonNegativeIntegerBuilder() {
  }

  public NonNegativeIntegerBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public NonNegativeIntegerBuilder from(NonNegativeIntegerModel value) {
    this.value = value.getValue();
    return this;
  }

  public NonNegativeIntegerModel build() {
    return new NonNegativeIntegerModel(this.value);
  }
}
