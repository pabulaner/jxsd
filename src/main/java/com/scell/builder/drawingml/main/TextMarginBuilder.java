package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextMarginModel;

public class TextMarginBuilder {
  private int value;

  public TextMarginBuilder() {
  }

  public TextMarginBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextMarginBuilder from(TextMarginModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextMarginModel build() {
    return new TextMarginModel(this.value);
  }
}
