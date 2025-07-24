package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextColumnCountModel;

public class TextColumnCountBuilder {
  private int value;

  public TextColumnCountBuilder() {
  }

  public TextColumnCountBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextColumnCountBuilder from(TextColumnCountModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextColumnCountModel build() {
    return new TextColumnCountModel(this.value);
  }
}
