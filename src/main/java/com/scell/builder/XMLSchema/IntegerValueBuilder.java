package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.IntegerValueModel;

public class IntegerValueBuilder {
  private long value;

  public IntegerValueBuilder() {
  }

  public IntegerValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public IntegerValueBuilder from(IntegerValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public IntegerValueModel build() {
    return new IntegerValueModel(this.value);
  }
}
