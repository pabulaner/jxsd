package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.IDREFValueModel;

public class IDREFValueBuilder {
  private String value;

  public IDREFValueBuilder() {
  }

  public IDREFValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public IDREFValueBuilder from(IDREFValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public IDREFValueModel build() {
    return new IDREFValueModel(this.value);
  }
}
