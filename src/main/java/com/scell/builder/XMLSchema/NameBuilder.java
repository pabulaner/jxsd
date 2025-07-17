package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NameModel;

public class NameBuilder {
  private String value;

  public NameBuilder() {
    this.value = null;
  }

  public NameBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NameBuilder from(NameModel value) {
    this.value = value.getValue();
    return this;
  }

  public NameModel build() {
    return new NameModel(this.value);
  }
}
