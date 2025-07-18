package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NonNegativeIntegerModel;

public class NonNegativeIntegerBuilder {
  private Long value;

  public NonNegativeIntegerBuilder() {
    this.value = null;
  }

  public NonNegativeIntegerBuilder setValue(Long value) {
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
