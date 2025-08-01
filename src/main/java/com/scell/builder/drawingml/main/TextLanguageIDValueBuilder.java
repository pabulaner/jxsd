package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextLanguageIDValueModel;

public class TextLanguageIDValueBuilder {
  private String value;

  public TextLanguageIDValueBuilder() {
  }

  public TextLanguageIDValueBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public TextLanguageIDValueBuilder from(TextLanguageIDValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextLanguageIDValueModel build() {
    return new TextLanguageIDValueModel(this.value);
  }
}
