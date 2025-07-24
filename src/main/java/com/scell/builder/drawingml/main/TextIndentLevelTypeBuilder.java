package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextIndentLevelTypeModel;

public class TextIndentLevelTypeBuilder {
  private int value;

  public TextIndentLevelTypeBuilder() {
  }

  public TextIndentLevelTypeBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextIndentLevelTypeBuilder from(TextIndentLevelTypeModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextIndentLevelTypeModel build() {
    return new TextIndentLevelTypeModel(this.value);
  }
}
