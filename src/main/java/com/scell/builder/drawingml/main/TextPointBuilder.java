package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextPointModel;

public class TextPointBuilder {
  private int value;

  public TextPointBuilder() {
  }

  public TextPointBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextPointBuilder from(TextPointModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextPointModel build() {
    return new TextPointModel(this.value);
  }
}
