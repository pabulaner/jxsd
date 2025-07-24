package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextFontSizeModel;

public class TextFontSizeBuilder {
  private int value;

  public TextFontSizeBuilder() {
  }

  public TextFontSizeBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextFontSizeBuilder from(TextFontSizeModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextFontSizeModel build() {
    return new TextFontSizeModel(this.value);
  }
}
