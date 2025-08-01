package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NonNegativeIntegerValueModel;

public class NonNegativeIntegerValueBuilder {
  private long value;

  public NonNegativeIntegerValueBuilder() {
  }

  public NonNegativeIntegerValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public NonNegativeIntegerValueBuilder from(NonNegativeIntegerValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public NonNegativeIntegerValueModel build() {
    return new NonNegativeIntegerValueModel(this.value);
  }
}
