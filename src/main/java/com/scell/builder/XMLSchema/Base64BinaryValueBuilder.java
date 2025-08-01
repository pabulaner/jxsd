package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.Base64BinaryValueModel;

public class Base64BinaryValueBuilder {
  private String value;

  public Base64BinaryValueBuilder() {
  }

  public Base64BinaryValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public Base64BinaryValueBuilder from(Base64BinaryValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public Base64BinaryValueModel build() {
    return new Base64BinaryValueModel(this.value);
  }
}
