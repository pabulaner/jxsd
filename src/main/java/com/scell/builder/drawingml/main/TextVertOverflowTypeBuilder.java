package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextVertOverflowTypeModel;

public class TextVertOverflowTypeBuilder {
  private TextVertOverflowTypeModel value;

  public TextVertOverflowTypeBuilder() {
    this.value = null;
  }

  public TextVertOverflowTypeBuilder from(TextVertOverflowTypeModel value) {
    this.value = value;
    return this;
  }

  public TextVertOverflowTypeModel build() {
    return this.value;
  }

  public TextVertOverflowTypeBuilder setValue(TextVertOverflowTypeModel value) {
    this.value = value;
    return this;
  }
}
