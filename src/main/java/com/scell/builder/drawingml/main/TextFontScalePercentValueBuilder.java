package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextFontScalePercentValueModel;

public class TextFontScalePercentValueBuilder {
  private int value;

  public TextFontScalePercentValueBuilder() {
  }

  public TextFontScalePercentValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextFontScalePercentValueBuilder from(TextFontScalePercentValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextFontScalePercentValueModel build() {
    return new TextFontScalePercentValueModel(this.value);
  }
}
