package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.LongModel;

public class LongBuilder {
  private long value;

  public LongBuilder() {
  }

  public LongBuilder setValue(long value) {
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
