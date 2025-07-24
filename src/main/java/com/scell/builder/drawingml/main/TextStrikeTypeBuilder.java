package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextStrikeTypeModel;

public class TextStrikeTypeBuilder {
  private TextStrikeTypeModel value;

  public TextStrikeTypeBuilder() {
    this.value = null;
  }

  public TextStrikeTypeBuilder from(TextStrikeTypeModel value) {
    this.value = value;
    return this;
  }

  public TextStrikeTypeModel build() {
    return this.value;
  }

  public TextStrikeTypeBuilder setValue(TextStrikeTypeModel value) {
    this.value = value;
    return this;
  }
}
