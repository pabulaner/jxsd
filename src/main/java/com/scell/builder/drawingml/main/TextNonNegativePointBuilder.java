package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextNonNegativePointModel;

public class TextNonNegativePointBuilder {
  private int value;

  public TextNonNegativePointBuilder() {
  }

  public TextNonNegativePointBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextNonNegativePointBuilder from(TextNonNegativePointModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextNonNegativePointModel build() {
    return new TextNonNegativePointModel(this.value);
  }
}
