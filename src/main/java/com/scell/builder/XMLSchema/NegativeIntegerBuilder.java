package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NegativeIntegerModel;

public class NegativeIntegerBuilder {
  private Long value;

  public NegativeIntegerBuilder() {
    this.value = null;
  }

  public NegativeIntegerBuilder setValue(Long value) {
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
