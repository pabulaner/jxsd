package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextFontAlignTypeModel;

public class TextFontAlignTypeBuilder {
  private TextFontAlignTypeModel value;

  public TextFontAlignTypeBuilder() {
    this.value = null;
  }

  public TextFontAlignTypeBuilder from(TextFontAlignTypeModel value) {
    this.value = value;
    return this;
  }

  public TextFontAlignTypeModel build() {
    return this.value;
  }

  public TextFontAlignTypeBuilder setValue(TextFontAlignTypeModel value) {
    this.value = value;
    return this;
  }
}
