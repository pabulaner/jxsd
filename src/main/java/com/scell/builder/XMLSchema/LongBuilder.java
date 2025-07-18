package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.LongModel;

public class LongBuilder {
  private Long value;

  public LongBuilder() {
    this.value = null;
  }

  public LongBuilder setValue(Long value) {
    this.value = value;
    return this;
  }

  public LongBuilder from(LongModel value) {
    this.value = value.getValue();
    return this;
  }

  public LongModel build() {
    return new LongModel(this.value);
  }
}
