package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedLongModel;

public class UnsignedLongBuilder {
  private long value;

  public UnsignedLongBuilder() {
  }

  public UnsignedLongBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public UnsignedLongBuilder from(UnsignedLongModel value) {
    this.value = value.getValue();
    return this;
  }

  public UnsignedLongModel build() {
    return new UnsignedLongModel(this.value);
  }
}
