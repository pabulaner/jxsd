package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextWrappingTypeModel;

public class TextWrappingTypeBuilder {
  private TextWrappingTypeModel value;

  public TextWrappingTypeBuilder() {
    this.value = null;
  }

  public TextWrappingTypeBuilder from(TextWrappingTypeModel value) {
    this.value = value;
    return this;
  }

  public TextWrappingTypeModel build() {
    return this.value;
  }

  public TextWrappingTypeBuilder setValue(TextWrappingTypeModel value) {
    this.value = value;
    return this;
  }
}
