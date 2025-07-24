package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextHorzOverflowTypeModel;

public class TextHorzOverflowTypeBuilder {
  private TextHorzOverflowTypeModel value;

  public TextHorzOverflowTypeBuilder() {
    this.value = null;
  }

  public TextHorzOverflowTypeBuilder from(TextHorzOverflowTypeModel value) {
    this.value = value;
    return this;
  }

  public TextHorzOverflowTypeModel build() {
    return this.value;
  }

  public TextHorzOverflowTypeBuilder setValue(TextHorzOverflowTypeModel value) {
    this.value = value;
    return this;
  }
}
