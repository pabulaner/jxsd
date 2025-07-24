package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NonPositiveIntegerModel;

public class NonPositiveIntegerBuilder {
  private long value;

  public NonPositiveIntegerBuilder() {
  }

  public NonPositiveIntegerBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public NonPositiveIntegerBuilder from(NonPositiveIntegerModel value) {
    this.value = value.getValue();
    return this;
  }

  public NonPositiveIntegerModel build() {
    return new NonPositiveIntegerModel(this.value);
  }
}
