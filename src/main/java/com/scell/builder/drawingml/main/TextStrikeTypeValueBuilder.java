package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextStrikeTypeValueModel;

public class TextStrikeTypeValueBuilder {
  private TextStrikeTypeValueModel value;

  public TextStrikeTypeValueBuilder() {
    this.value = null;
  }

  public TextStrikeTypeValueBuilder from(TextStrikeTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextStrikeTypeValueModel build() {
    return this.value;
  }

  public TextStrikeTypeValueBuilder setValue(TextStrikeTypeValueModel value) {
    this.value = value;
    return this;
  }
}
