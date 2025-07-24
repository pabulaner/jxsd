package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.HexBinaryModel;

public class HexBinaryBuilder {
  private String value;

  public HexBinaryBuilder() {
  }

  public HexBinaryBuilder setValue(String value) {
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
