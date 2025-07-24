package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.IDREFModel;

public class IDREFBuilder {
  private String value;

  public IDREFBuilder() {
  }

  public IDREFBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public IDREFBuilder from(IDREFModel value) {
    this.value = value.getValue();
    return this;
  }

  public IDREFModel build() {
    return new IDREFModel(this.value);
  }
}
