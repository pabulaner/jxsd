package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextAnchoringTypeValueModel;

public class TextAnchoringTypeValueBuilder {
  private TextAnchoringTypeValueModel value;

  public TextAnchoringTypeValueBuilder() {
    this.value = null;
  }

  public TextAnchoringTypeValueBuilder from(TextAnchoringTypeValueModel value) {
    this.value = value;
    return this;
  }

  public TextAnchoringTypeValueModel build() {
    return this.value;
  }

  public TextAnchoringTypeValueBuilder setValue(TextAnchoringTypeValueModel value) {
    this.value = value;
    return this;
  }
}
