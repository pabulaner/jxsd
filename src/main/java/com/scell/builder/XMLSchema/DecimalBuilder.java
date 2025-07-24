package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DecimalModel;

public class DecimalBuilder {
  private long value;

  public DecimalBuilder() {
  }

  public DecimalBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public DecimalBuilder from(DecimalModel value) {
    this.value = value.getValue();
    return this;
  }

  public DecimalModel build() {
    return new DecimalModel(this.value);
  }
}
