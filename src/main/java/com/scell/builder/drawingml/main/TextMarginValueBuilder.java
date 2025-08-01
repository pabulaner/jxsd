package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextMarginValueModel;

public class TextMarginValueBuilder {
  private int value;

  public TextMarginValueBuilder() {
  }

  public TextMarginValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextMarginValueBuilder from(TextMarginValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextMarginValueModel build() {
    return new TextMarginValueModel(this.value);
  }
}
