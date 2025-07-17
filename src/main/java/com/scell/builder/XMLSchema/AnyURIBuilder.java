package com.scell.builder.XMLSchema;

import com.scell.model.XMLSchema.AnyURIModel;

public class AnyURIBuilder {
  private String value;

  public AnyURIBuilder() {
    this.value = null;
  }

  public AnyURIBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public AnyURIBuilder from(AnyURIModel value) {
    this.value = value.getValue();
    return this;
  }

  public AnyURIModel build() {
    return new AnyURIModel(this.value);
  }
}
