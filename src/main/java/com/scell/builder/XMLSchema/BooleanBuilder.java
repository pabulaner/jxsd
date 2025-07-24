package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.BooleanModel;

public class BooleanBuilder {
  private boolean value;

  public BooleanBuilder() {
  }

  public BooleanBuilder setValue(boolean value) {
    this.value = value;
    return this;
  }

  public BooleanBuilder from(BooleanModel value) {
    this.value = value.getValue();
    return this;
  }

  public BooleanModel build() {
    return new BooleanModel(this.value);
  }
}
