package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextColumnCountValueModel;

public class TextColumnCountValueBuilder {
  private int value;

  public TextColumnCountValueBuilder() {
  }

  public TextColumnCountValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextColumnCountValueBuilder from(TextColumnCountValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextColumnCountValueModel build() {
    return new TextColumnCountValueModel(this.value);
  }
}
