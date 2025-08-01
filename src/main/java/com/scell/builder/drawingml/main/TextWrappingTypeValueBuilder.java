package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextWrappingTypeValueModel;

public class TextWrappingTypeValueBuilder {
  private TextWrappingTypeValueModel value;

  public TextWrappingTypeValueBuilder() {
    this.value = null;
  }

  public TextWrappingTypeValueBuilder from(TextWrappingTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextWrappingTypeValueModel build() {
    return this.value;
  }

  public TextWrappingTypeValueBuilder setValue(TextWrappingTypeValueModel value) {
    this.value = value;
    return this;
  }
}
