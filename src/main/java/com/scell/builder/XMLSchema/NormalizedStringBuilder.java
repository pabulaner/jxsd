package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NormalizedStringModel;

public class NormalizedStringBuilder {
  private String value;

  public NormalizedStringBuilder() {
  }

  public NormalizedStringBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NormalizedStringBuilder from(NormalizedStringModel value) {
    this.value = value.getValue();
    return this;
  }

  public NormalizedStringModel build() {
    return new NormalizedStringModel(this.value);
  }
}
