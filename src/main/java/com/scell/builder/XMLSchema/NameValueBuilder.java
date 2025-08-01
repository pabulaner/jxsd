package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NameValueModel;

public class NameValueBuilder {
  private String value;

  public NameValueBuilder() {
  }

  public NameValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NameValueBuilder from(NameValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public NameValueModel build() {
    return new NameValueModel(this.value);
  }
}
