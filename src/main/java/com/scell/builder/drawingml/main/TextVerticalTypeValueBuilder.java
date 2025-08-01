package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextVerticalTypeValueModel;

public class TextVerticalTypeValueBuilder {
  private TextVerticalTypeValueModel value;

  public TextVerticalTypeValueBuilder() {
    this.value = null;
  }

  public TextVerticalTypeValueBuilder from(TextVerticalTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextVerticalTypeValueModel build() {
    return this.value;
  }

  public TextVerticalTypeValueBuilder setValue(TextVerticalTypeValueModel value) {
    this.value = value;
    return this;
  }
}
