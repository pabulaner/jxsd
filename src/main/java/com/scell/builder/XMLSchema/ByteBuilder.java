package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.ByteModel;

public class ByteBuilder {
  private Long value;

  public ByteBuilder() {
    this.value = null;
  }

  public ByteBuilder setValue(Long value) {
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
