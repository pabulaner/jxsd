package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NOTATIONValueModel;

public class NOTATIONValueBuilder {
  private String value;

  public NOTATIONValueBuilder() {
  }

  public NOTATIONValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NOTATIONValueBuilder from(NOTATIONValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public NOTATIONValueModel build() {
    return new NOTATIONValueModel(this.value);
  }
}
