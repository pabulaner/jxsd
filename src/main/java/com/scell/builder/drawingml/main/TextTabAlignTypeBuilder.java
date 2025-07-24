package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextTabAlignTypeModel;

public class TextTabAlignTypeBuilder {
  private TextTabAlignTypeModel value;

  public TextTabAlignTypeBuilder() {
    this.value = null;
  }

  public TextTabAlignTypeBuilder from(TextTabAlignTypeModel value) {
    this.value = value;
    return this;
  }

  public TextTabAlignTypeModel build() {
    return this.value;
  }

  public TextTabAlignTypeBuilder setValue(TextTabAlignTypeModel value) {
    this.value = value;
    return this;
  }
}
