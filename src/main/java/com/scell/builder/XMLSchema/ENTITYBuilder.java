package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.ENTITYModel;

public class ENTITYBuilder {
  private String value;

  public ENTITYBuilder() {
    this.value = null;
  }

  public ENTITYBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public ENTITYBuilder from(ENTITYModel value) {
    this.value = value.getValue();
    return this;
  }

  public ENTITYModel build() {
    return new ENTITYModel(this.value);
  }
}
