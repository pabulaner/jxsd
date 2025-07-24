package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextCapsTypeModel;

public class TextCapsTypeBuilder {
  private TextCapsTypeModel value;

  public TextCapsTypeBuilder() {
    this.value = null;
  }

  public TextCapsTypeBuilder from(TextCapsTypeModel value) {
    this.value = value;
    return this;
  }

  public TextCapsTypeModel build() {
    return this.value;
  }

  public TextCapsTypeBuilder setValue(TextCapsTypeModel value) {
    this.value = value;
    return this;
  }
}
