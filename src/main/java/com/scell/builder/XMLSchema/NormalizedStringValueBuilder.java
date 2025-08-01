package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NormalizedStringValueModel;

public class NormalizedStringValueBuilder {
  private String value;

  public NormalizedStringValueBuilder() {
  }

  public NormalizedStringValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NormalizedStringValueBuilder from(NormalizedStringValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public NormalizedStringValueModel build() {
    return new NormalizedStringValueModel(this.value);
  }
}
