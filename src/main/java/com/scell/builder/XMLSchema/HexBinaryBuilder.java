package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.HexBinaryModel;

public class HexBinaryBuilder {
  private byte[] value;

  public HexBinaryBuilder() {
    this.value = null;
  }

  public HexBinaryBuilder setValue(byte[] value) {
    this.value = value;
    return this;
  }

  public HexBinaryBuilder from(HexBinaryModel value) {
    this.value = value.getValue();
    return this;
  }

  public HexBinaryModel build() {
    return new HexBinaryModel(this.value);
  }
}
