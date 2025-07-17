package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedShortModel;

public class UnsignedShortBuilder {
  private Long value;

  public UnsignedShortBuilder() {
    this.value = null;
  }

  public UnsignedShortBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public UnsignedShortBuilder from(UnsignedShortModel value) {
    this.value = value.getValue();
    return this;
  }

  public UnsignedShortModel build() {
    return new UnsignedShortModel(this.value);
  }
}
