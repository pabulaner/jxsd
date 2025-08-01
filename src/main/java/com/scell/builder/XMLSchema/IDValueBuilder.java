package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.IDValueModel;

public class IDValueBuilder {
  private String value;

  public IDValueBuilder() {
  }

  public IDValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public IDValueBuilder from(IDValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public IDValueModel build() {
    return new IDValueModel(this.value);
  }
}
