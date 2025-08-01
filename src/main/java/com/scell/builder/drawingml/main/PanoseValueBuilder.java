package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PanoseValueModel;

public class PanoseValueBuilder {
  private String value;

  public PanoseValueBuilder() {
  }

  public PanoseValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public PanoseValueBuilder from(PanoseValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public PanoseValueModel build() {
    return new PanoseValueModel(this.value);
  }
}
