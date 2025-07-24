package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.StringModel;

public class StringBuilder {
  private String value;

  public StringBuilder() {
  }

  public StringBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public StringBuilder from(StringModel value) {
    this.value = value.getValue();
    return this;
  }

  public StringModel build() {
    return new StringModel(this.value);
  }
}
