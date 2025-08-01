package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.ENTITYValueModel;

public class ENTITYValueBuilder {
  private String value;

  public ENTITYValueBuilder() {
  }

  public ENTITYValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ENTITYValueBuilder from(ENTITYValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public ENTITYValueModel build() {
    return new ENTITYValueModel(this.value);
  }
}
