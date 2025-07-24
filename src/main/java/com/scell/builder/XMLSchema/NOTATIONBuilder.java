package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NOTATIONModel;

public class NOTATIONBuilder {
  private String value;

  public NOTATIONBuilder() {
  }

  public NOTATIONBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NOTATIONBuilder from(NOTATIONModel value) {
    this.value = value.getValue();
    return this;
  }

  public NOTATIONModel build() {
    return new NOTATIONModel(this.value);
  }
}
