package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NegativeIntegerValueModel;

public class NegativeIntegerValueBuilder {
  private long value;

  public NegativeIntegerValueBuilder() {
  }

  public NegativeIntegerValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public NegativeIntegerValueBuilder from(NegativeIntegerValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public NegativeIntegerValueModel build() {
    return new NegativeIntegerValueModel(this.value);
  }
}
