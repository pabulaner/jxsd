package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.BooleanValueModel;

public class BooleanValueBuilder {
  private boolean value;

  public BooleanValueBuilder() {
  }

  public BooleanValueBuilder setValue(boolean value) {
    this.value = value;
    return this;
  }

  public BooleanValueBuilder from(BooleanValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public BooleanValueModel build() {
    return new BooleanValueModel(this.value);
  }
}
