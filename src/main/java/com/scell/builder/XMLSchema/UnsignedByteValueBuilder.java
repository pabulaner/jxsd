package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedByteValueModel;

public class UnsignedByteValueBuilder {
  private short value;

  public UnsignedByteValueBuilder() {
  }

  public UnsignedByteValueBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public UnsignedByteValueBuilder from(UnsignedByteValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public UnsignedByteValueModel build() {
    return new UnsignedByteValueModel(this.value);
  }
}
