package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.PanoseModel;

public class PanoseBuilder {
  private String value;

  public PanoseBuilder() {
  }

  public PanoseBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public PanoseBuilder from(PanoseModel value) {
    this.value = value.getValue();
    return this;
  }

  public PanoseModel build() {
    return new PanoseModel(this.value);
  }
}
