package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GuidValueModel;

public class GuidValueBuilder {
  private String value;

  public GuidValueBuilder() {
  }

  public GuidValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public GuidValueBuilder from(GuidValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public GuidValueModel build() {
    return new GuidValueModel(this.value);
  }
}
