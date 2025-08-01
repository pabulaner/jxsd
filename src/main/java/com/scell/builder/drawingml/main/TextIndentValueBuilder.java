package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextIndentValueModel;

public class TextIndentValueBuilder {
  private int value;

  public TextIndentValueBuilder() {
  }

  public TextIndentValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextIndentValueBuilder from(TextIndentValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextIndentValueModel build() {
    return new TextIndentValueModel(this.value);
  }
}
