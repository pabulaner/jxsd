package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedIntModel;

public class UnsignedIntBuilder {
  private Long value;

  public UnsignedIntBuilder() {
    this.value = null;
  }

  public UnsignedIntBuilder setValue(Long value) {
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
