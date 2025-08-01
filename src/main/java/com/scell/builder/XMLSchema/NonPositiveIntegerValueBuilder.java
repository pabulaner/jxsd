package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NonPositiveIntegerValueModel;

public class NonPositiveIntegerValueBuilder {
  private long value;

  public NonPositiveIntegerValueBuilder() {
  }

  public NonPositiveIntegerValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public NonPositiveIntegerValueBuilder from(NonPositiveIntegerValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public NonPositiveIntegerValueModel build() {
    return new NonPositiveIntegerValueModel(this.value);
  }
}
