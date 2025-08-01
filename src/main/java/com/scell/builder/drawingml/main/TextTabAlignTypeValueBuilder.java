package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextTabAlignTypeValueModel;

public class TextTabAlignTypeValueBuilder {
  private TextTabAlignTypeValueModel value;

  public TextTabAlignTypeValueBuilder() {
    this.value = null;
  }

  public TextTabAlignTypeValueBuilder from(TextTabAlignTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextTabAlignTypeValueModel build() {
    return this.value;
  }

  public TextTabAlignTypeValueBuilder setValue(TextTabAlignTypeValueModel value) {
    this.value = value;
    return this;
  }
}
