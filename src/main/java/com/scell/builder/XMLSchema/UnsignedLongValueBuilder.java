package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedLongValueModel;

public class UnsignedLongValueBuilder {
  private long value;

  public UnsignedLongValueBuilder() {
  }

  public UnsignedLongValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public UnsignedLongValueBuilder from(UnsignedLongValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public UnsignedLongValueModel build() {
    return new UnsignedLongValueModel(this.value);
  }
}
