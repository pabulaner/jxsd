package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.ShortValueModel;

public class ShortValueBuilder {
  private short value;

  public ShortValueBuilder() {
  }

  public ShortValueBuilder setValue(short value) {
    this.value = value;
    return this;
  }

  public ShortValueBuilder from(ShortValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public ShortValueModel build() {
    return new ShortValueModel(this.value);
  }
}
