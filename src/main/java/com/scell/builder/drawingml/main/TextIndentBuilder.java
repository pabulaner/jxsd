package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextIndentModel;

public class TextIndentBuilder {
  private int value;

  public TextIndentBuilder() {
  }

  public TextIndentBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextIndentBuilder from(TextIndentModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextIndentModel build() {
    return new TextIndentModel(this.value);
  }
}
