package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.StringValueModel;

public class StringValueBuilder {
  private String value;

  public StringValueBuilder() {
  }

  public StringValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public StringValueBuilder from(StringValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public StringValueModel build() {
    return new StringValueModel(this.value);
  }
}
