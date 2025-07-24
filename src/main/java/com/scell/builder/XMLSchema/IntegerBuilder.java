package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.IntegerModel;

public class IntegerBuilder {
  private long value;

  public IntegerBuilder() {
  }

  public IntegerBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public IntegerBuilder from(IntegerModel value) {
    this.value = value.getValue();
    return this;
  }

  public IntegerModel build() {
    return new IntegerModel(this.value);
  }
}
