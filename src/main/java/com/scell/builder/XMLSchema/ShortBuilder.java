package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.ShortModel;

public class ShortBuilder {
  private Long value;

  public ShortBuilder() {
    this.value = null;
  }

  public ShortBuilder setValue(Long value) {
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
