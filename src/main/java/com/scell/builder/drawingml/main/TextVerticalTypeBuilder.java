package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextVerticalTypeModel;

public class TextVerticalTypeBuilder {
  private TextVerticalTypeModel value;

  public TextVerticalTypeBuilder() {
    this.value = null;
  }

  public TextVerticalTypeBuilder from(TextVerticalTypeModel value) {
    this.value = value;
    return this;
  }

  public TextVerticalTypeModel build() {
    return this.value;
  }

  public TextVerticalTypeBuilder setValue(TextVerticalTypeModel value) {
    this.value = value;
    return this;
  }
}
