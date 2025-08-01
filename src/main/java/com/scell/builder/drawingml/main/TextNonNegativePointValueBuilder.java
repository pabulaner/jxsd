package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextNonNegativePointValueModel;

public class TextNonNegativePointValueBuilder {
  private int value;

  public TextNonNegativePointValueBuilder() {
  }

  public TextNonNegativePointValueBuilder setValue(int value) {
    this.value = value;
    return this;
  }

  public TextNonNegativePointValueBuilder from(TextNonNegativePointValueModel value) {
    this.value = value.getValue();
    return this;
  }

  public TextNonNegativePointValueModel build() {
    return new TextNonNegativePointValueModel(this.value);
  }
}
