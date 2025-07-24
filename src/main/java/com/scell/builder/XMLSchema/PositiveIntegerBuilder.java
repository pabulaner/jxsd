package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.PositiveIntegerModel;

public class PositiveIntegerBuilder {
  private long value;

  public PositiveIntegerBuilder() {
  }

  public PositiveIntegerBuilder setValue(long value) {
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
