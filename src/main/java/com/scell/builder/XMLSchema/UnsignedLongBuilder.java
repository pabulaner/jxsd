package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedLongModel;

public class UnsignedLongBuilder {
  private Long value;

  public UnsignedLongBuilder() {
    this.value = null;
  }

  public UnsignedLongBuilder setValue(Long value) {
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
