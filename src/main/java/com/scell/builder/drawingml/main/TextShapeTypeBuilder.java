package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextShapeTypeModel;

public class TextShapeTypeBuilder {
  private TextShapeTypeModel value;

  public TextShapeTypeBuilder() {
    this.value = null;
  }

  public TextShapeTypeBuilder from(TextShapeTypeModel value) {
    this.value = value;
    return this;
  }

  public TextShapeTypeModel build() {
    return this.value;
  }

  public TextShapeTypeBuilder setValue(TextShapeTypeModel value) {
    this.value = value;
    return this;
  }
}
