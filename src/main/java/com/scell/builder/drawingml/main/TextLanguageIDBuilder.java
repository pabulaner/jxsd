package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextLanguageIDModel;

public class TextLanguageIDBuilder {
  private String value;

  public TextLanguageIDBuilder() {
  }

  public TextLanguageIDBuilder setValue(String value) {
    this.value = value;
    return this;
  }

  public TextLanguageIDBuilder from(TextLanguageIDModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextLanguageIDModel build() {
    return new TextLanguageIDModel(this.value);
  }
}
