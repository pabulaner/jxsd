package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.Base64BinaryModel;

public class Base64BinaryBuilder {
  private byte[] value;

  public Base64BinaryBuilder() {
    this.value = null;
  }

  public Base64BinaryBuilder setValue(byte[] value) {
    this.value = value;
    return this;
  }

  public Base64BinaryBuilder from(Base64BinaryModel value) {
    this.value = value.getValue();
    return this;
  }

  public Base64BinaryModel build() {
    return new Base64BinaryModel(this.value);
  }
}
