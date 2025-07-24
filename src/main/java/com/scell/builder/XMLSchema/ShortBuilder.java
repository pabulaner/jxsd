package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.ShortModel;

public class ShortBuilder {
  private short value;

  public ShortBuilder() {
  }

  public ShortBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public ShortBuilder from(ShortModel value) {
    this.value = value.getValue();
    return this;
  }

  public ShortModel build() {
    return new ShortModel(this.value);
  }
}
