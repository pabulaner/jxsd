package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.IDModel;

public class IDBuilder {
  private String value;

  public IDBuilder() {
  }

  public IDBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public IDBuilder from(IDModel value) {
    this.value = value.getValue();
    return this;
  }

  public IDModel build() {
    return new IDModel(this.value);
  }
}
