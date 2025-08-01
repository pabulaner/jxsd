package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.ByteValueModel;

public class ByteValueBuilder {
  private byte value;

  public ByteValueBuilder() {
  }

  public ByteValueBuilder setValue(byte value) {
    this.value = value;
    return this;
  }

  public ByteValueBuilder from(ByteValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public ByteValueModel build() {
    return new ByteValueModel(this.value);
  }
}
