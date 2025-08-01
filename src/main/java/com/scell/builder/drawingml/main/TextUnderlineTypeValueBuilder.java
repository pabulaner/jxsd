package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextUnderlineTypeValueModel;

public class TextUnderlineTypeValueBuilder {
  private TextUnderlineTypeValueModel value;

  public TextUnderlineTypeValueBuilder() {
    this.value = null;
  }

  public TextUnderlineTypeValueBuilder from(TextUnderlineTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextUnderlineTypeValueModel build() {
    return this.value;
  }

  public TextUnderlineTypeValueBuilder setValue(TextUnderlineTypeValueModel value) {
    this.value = value;
    return this;
  }
}
