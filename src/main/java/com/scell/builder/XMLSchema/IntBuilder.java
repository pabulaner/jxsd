package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.IntModel;

public class IntBuilder {
  private Long value;

  public IntBuilder() {
    this.value = null;
  }

  public IntBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public IntBuilder from(IntModel value) {
    this.value = value.getValue();
    return this;
  }

  public IntModel build() {
    return new IntModel(this.value);
  }
}
