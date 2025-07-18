package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.BooleanModel;

public class BooleanBuilder {
  private Boolean value;

  public BooleanBuilder() {
    this.value = null;
  }

  public BooleanBuilder setValue(Boolean value) {
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
