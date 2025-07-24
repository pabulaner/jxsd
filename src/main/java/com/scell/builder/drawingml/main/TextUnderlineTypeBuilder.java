package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextUnderlineTypeModel;

public class TextUnderlineTypeBuilder {
  private TextUnderlineTypeModel value;

  public TextUnderlineTypeBuilder() {
    this.value = null;
  }

  public TextUnderlineTypeBuilder from(TextUnderlineTypeModel value) {
    this.value = value;
    return this;
  }

  public TextUnderlineTypeModel build() {
    return this.value;
  }

  public TextUnderlineTypeBuilder setValue(TextUnderlineTypeModel value) {
    this.value = value;
    return this;
  }
}
