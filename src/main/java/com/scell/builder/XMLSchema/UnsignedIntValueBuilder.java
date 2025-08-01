package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.UnsignedIntValueModel;

public class UnsignedIntValueBuilder {
  private long value;

  public UnsignedIntValueBuilder() {
  }

  public UnsignedIntValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public UnsignedIntValueBuilder from(UnsignedIntValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public UnsignedIntValueModel build() {
    return new UnsignedIntValueModel(this.value);
  }
}
