package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextHorzOverflowTypeValueModel;

public class TextHorzOverflowTypeValueBuilder {
  private TextHorzOverflowTypeValueModel value;

  public TextHorzOverflowTypeValueBuilder() {
    this.value = null;
  }

  public TextHorzOverflowTypeValueBuilder from(TextHorzOverflowTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextHorzOverflowTypeValueModel build() {
    return this.value;
  }

  public TextHorzOverflowTypeValueBuilder setValue(TextHorzOverflowTypeValueModel value) {
    this.value = value;
    return this;
  }
}
