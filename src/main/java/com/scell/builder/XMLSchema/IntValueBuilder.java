package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.IntValueModel;

public class IntValueBuilder {
  private int value;

  public IntValueBuilder() {
  }

  public IntValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public IntValueBuilder from(IntValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public IntValueModel build() {
    return new IntValueModel(this.value);
  }
}
