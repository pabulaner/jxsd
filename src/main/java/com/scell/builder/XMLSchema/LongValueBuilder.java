package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.LongValueModel;

public class LongValueBuilder {
  private long value;

  public LongValueBuilder() {
  }

  public LongValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public LongValueBuilder from(LongValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public LongValueModel build() {
    return new LongValueModel(this.value);
  }
}
