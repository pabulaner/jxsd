package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextAlignTypeModel;

public class TextAlignTypeBuilder {
  private TextAlignTypeModel value;

  public TextAlignTypeBuilder() {
    this.value = null;
  }

  public TextAlignTypeBuilder from(TextAlignTypeModel value) {
    this.value = value;
    return this;
  }

  public TextAlignTypeModel build() {
    return this.value;
  }

  public TextAlignTypeBuilder setValue(TextAlignTypeModel value) {
    this.value = value;
    return this;
  }
}
