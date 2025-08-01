package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.DecimalValueModel;

public class DecimalValueBuilder {
  private long value;

  public DecimalValueBuilder() {
  }

  public DecimalValueBuilder setValue(long value) {
    this.value = value;
    return this;
  }

  public DecimalValueBuilder from(DecimalValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public DecimalValueModel build() {
    return new DecimalValueModel(this.value);
  }
}
