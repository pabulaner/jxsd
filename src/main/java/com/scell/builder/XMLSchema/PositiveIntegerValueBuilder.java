package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.PositiveIntegerValueModel;

public class PositiveIntegerValueBuilder {
  private long value;

  public PositiveIntegerValueBuilder() {
  }

  public PositiveIntegerValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public PositiveIntegerValueBuilder from(PositiveIntegerValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PositiveIntegerValueModel build() {
    return new PositiveIntegerValueModel(this.value);
  }
}
