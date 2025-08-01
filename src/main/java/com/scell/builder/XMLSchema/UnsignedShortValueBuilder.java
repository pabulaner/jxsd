package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedShortValueModel;

public class UnsignedShortValueBuilder {
  private int value;

  public UnsignedShortValueBuilder() {
  }

  public UnsignedShortValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public UnsignedShortValueBuilder from(UnsignedShortValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public UnsignedShortValueModel build() {
    return new UnsignedShortValueModel(this.value);
  }
}
