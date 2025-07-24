package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedByteModel;

public class UnsignedByteBuilder {
  private short value;

  public UnsignedByteBuilder() {
  }

  public UnsignedByteBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public UnsignedByteBuilder from(UnsignedByteModel value) {
    this.value = value.getValue();
    return this;
  }

  public UnsignedByteModel build() {
    return new UnsignedByteModel(this.value);
  }
}
