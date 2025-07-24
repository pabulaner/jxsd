package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextTypefaceModel;

public class TextTypefaceBuilder {
  private String value;

  public TextTypefaceBuilder() {
  }

  public TextTypefaceBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public TextTypefaceBuilder from(TextTypefaceModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextTypefaceModel build() {
    return new TextTypefaceModel(this.value);
  }
}
