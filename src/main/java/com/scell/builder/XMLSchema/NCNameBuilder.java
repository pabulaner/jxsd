package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.NCNameModel;

public class NCNameBuilder {
  private String value;

  public NCNameBuilder() {
  }

  public NCNameBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public NCNameBuilder from(NCNameModel value) {
    this.value = value.getValue();
    return this;
  }

  public NCNameModel build() {
    return new NCNameModel(this.value);
  }
}
