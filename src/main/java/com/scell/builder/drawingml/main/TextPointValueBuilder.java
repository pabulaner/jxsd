package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextPointValueModel;

public class TextPointValueBuilder {
  private int value;

  public TextPointValueBuilder() {
  }

  public TextPointValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextPointValueBuilder from(TextPointValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextPointValueModel build() {
    return new TextPointValueModel(this.value);
  }
}
