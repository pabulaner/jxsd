package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.PositiveIntegerModel;

public class PositiveIntegerBuilder {
  private Long value;

  public PositiveIntegerBuilder() {
    this.value = null;
  }

  public PositiveIntegerBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public PositiveIntegerBuilder from(PositiveIntegerModel value) {
    this.value = value.getValue();
    return this;
  }

  public PositiveIntegerModel build() {
    return new PositiveIntegerModel(this.value);
  }
}
