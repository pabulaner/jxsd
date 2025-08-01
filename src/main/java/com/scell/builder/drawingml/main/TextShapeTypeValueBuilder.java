package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextShapeTypeValueModel;

public class TextShapeTypeValueBuilder {
  private TextShapeTypeValueModel value;

  public TextShapeTypeValueBuilder() {
    this.value = null;
  }

  public TextShapeTypeValueBuilder from(TextShapeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextShapeTypeValueModel build() {
    return this.value;
  }

  public TextShapeTypeValueBuilder setValue(TextShapeTypeValueModel value) {
    this.value = value;
    return this;
  }
}
