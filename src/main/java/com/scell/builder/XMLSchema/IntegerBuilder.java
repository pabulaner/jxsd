package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.IntegerModel;

public class IntegerBuilder {
  private Long value;

  public IntegerBuilder() {
    this.value = null;
  }

  public IntegerBuilder setValue(Long value) {
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
