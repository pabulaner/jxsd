package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NegativeIntegerModel;

public class NegativeIntegerBuilder {
  private long value;

  public NegativeIntegerBuilder() {
  }

  public NegativeIntegerBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public NegativeIntegerBuilder from(NegativeIntegerModel value) {
    this.value = value.getValue();
    return this;
  }

  public NegativeIntegerModel build() {
    return new NegativeIntegerModel(this.value);
  }
}
