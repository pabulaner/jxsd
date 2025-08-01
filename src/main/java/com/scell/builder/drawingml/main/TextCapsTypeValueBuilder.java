package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextCapsTypeValueModel;

public class TextCapsTypeValueBuilder {
  private TextCapsTypeValueModel value;

  public TextCapsTypeValueBuilder() {
    this.value = null;
  }

  public TextCapsTypeValueBuilder from(TextCapsTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextCapsTypeValueModel build() {
    return this.value;
  }

  public TextCapsTypeValueBuilder setValue(TextCapsTypeValueModel value) {
    this.value = value;
    return this;
  }
}
