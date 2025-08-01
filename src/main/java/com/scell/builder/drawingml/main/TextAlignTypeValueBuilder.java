package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextAlignTypeValueModel;

public class TextAlignTypeValueBuilder {
  private TextAlignTypeValueModel value;

  public TextAlignTypeValueBuilder() {
    this.value = null;
  }

  public TextAlignTypeValueBuilder from(TextAlignTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextAlignTypeValueModel build() {
    return this.value;
  }

  public TextAlignTypeValueBuilder setValue(TextAlignTypeValueModel value) {
    this.value = value;
    return this;
  }
}
