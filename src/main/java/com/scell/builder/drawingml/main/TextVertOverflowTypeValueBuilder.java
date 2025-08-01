package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextVertOverflowTypeValueModel;

public class TextVertOverflowTypeValueBuilder {
  private TextVertOverflowTypeValueModel value;

  public TextVertOverflowTypeValueBuilder() {
    this.value = null;
  }

  public TextVertOverflowTypeValueBuilder from(TextVertOverflowTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextVertOverflowTypeValueModel build() {
    return this.value;
  }

  public TextVertOverflowTypeValueBuilder setValue(TextVertOverflowTypeValueModel value) {
    this.value = value;
    return this;
  }
}
