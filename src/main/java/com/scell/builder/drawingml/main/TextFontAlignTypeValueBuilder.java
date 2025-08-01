package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextFontAlignTypeValueModel;

public class TextFontAlignTypeValueBuilder {
  private TextFontAlignTypeValueModel value;

  public TextFontAlignTypeValueBuilder() {
    this.value = null;
  }

  public TextFontAlignTypeValueBuilder from(TextFontAlignTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextFontAlignTypeValueModel build() {
    return this.value;
  }

  public TextFontAlignTypeValueBuilder setValue(TextFontAlignTypeValueModel value) {
    this.value = value;
    return this;
  }
}
