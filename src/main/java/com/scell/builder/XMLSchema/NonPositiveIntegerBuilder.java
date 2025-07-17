package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NonPositiveIntegerModel;

public class NonPositiveIntegerBuilder {
  private Long value;

  public NonPositiveIntegerBuilder() {
    this.value = null;
  }

  public NonPositiveIntegerBuilder setValue(Long value) {
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
