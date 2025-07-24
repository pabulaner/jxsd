package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.GuidModel;

public class GuidBuilder {
  private String value;

  public GuidBuilder() {
  }

  public GuidBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public GuidBuilder from(GuidModel value) {
    this.value = value.getValue();
    return this;
  }

  public GuidModel build() {
    return new GuidModel(this.value);
  }
}
