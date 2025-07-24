package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedIntModel;

public class UnsignedIntBuilder {
  private long value;

  public UnsignedIntBuilder() {
  }

  public UnsignedIntBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public UnsignedIntBuilder from(UnsignedIntModel value) {
    this.value = value.getValue();
    return this;
  }

  public UnsignedIntModel build() {
    return new UnsignedIntModel(this.value);
  }
}
