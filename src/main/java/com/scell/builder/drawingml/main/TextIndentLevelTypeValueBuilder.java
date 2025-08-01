package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextIndentLevelTypeValueModel;

public class TextIndentLevelTypeValueBuilder {
  private int value;

  public TextIndentLevelTypeValueBuilder() {
  }

  public TextIndentLevelTypeValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextIndentLevelTypeValueBuilder from(TextIndentLevelTypeValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextIndentLevelTypeValueModel build() {
    return new TextIndentLevelTypeValueModel(this.value);
  }
}
