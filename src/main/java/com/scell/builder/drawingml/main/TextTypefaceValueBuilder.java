package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextTypefaceValueModel;

public class TextTypefaceValueBuilder {
  private String value;

  public TextTypefaceValueBuilder() {
  }

  public TextTypefaceValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public TextTypefaceValueBuilder from(TextTypefaceValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextTypefaceValueModel build() {
    return new TextTypefaceValueModel(this.value);
  }
}
