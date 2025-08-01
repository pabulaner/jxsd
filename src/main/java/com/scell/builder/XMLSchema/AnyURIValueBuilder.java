package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.AnyURIValueModel;

public class AnyURIValueBuilder {
  private String value;

  public AnyURIValueBuilder() {
  }

  public AnyURIValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public AnyURIValueBuilder from(AnyURIValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public AnyURIValueModel build() {
    return new AnyURIValueModel(this.value);
  }
}
