package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedShortModel;

public class UnsignedShortBuilder {
  private int value;

  public UnsignedShortBuilder() {
  }

  public UnsignedShortBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public UnsignedShortBuilder from(UnsignedShortModel value) {
    this.value = value.getValue();
    return this;
  }

  public UnsignedShortModel build() {
    return new UnsignedShortModel(this.value);
  }
}
