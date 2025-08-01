package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.HexBinaryValueModel;

public class HexBinaryValueBuilder {
  private String value;

  public HexBinaryValueBuilder() {
  }

  public HexBinaryValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public HexBinaryValueBuilder from(HexBinaryValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public HexBinaryValueModel build() {
    return new HexBinaryValueModel(this.value);
  }
}
