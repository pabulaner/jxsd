package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextFontScalePercentModel;

public class TextFontScalePercentBuilder {
  private int value;

  public TextFontScalePercentBuilder() {
  }

  public TextFontScalePercentBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextFontScalePercentBuilder from(TextFontScalePercentModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextFontScalePercentModel build() {
    return new TextFontScalePercentModel(this.value);
  }
}
