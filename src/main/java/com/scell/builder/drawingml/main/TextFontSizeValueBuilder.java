package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextFontSizeValueModel;

public class TextFontSizeValueBuilder {
  private int value;

  public TextFontSizeValueBuilder() {
  }

  public TextFontSizeValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextFontSizeValueBuilder from(TextFontSizeValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextFontSizeValueModel build() {
    return new TextFontSizeValueModel(this.value);
  }
}
