package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.ByteModel;

public class ByteBuilder {
  private byte value;

  public ByteBuilder() {
  }

  public ByteBuilder setValue(byte value) {
    this.value = value;
    return this;
  }

  public ByteBuilder from(ByteModel value) {
    this.value = value.getValue();
    return this;
  }

  public ByteModel build() {
    return new ByteModel(this.value);
  }
}
