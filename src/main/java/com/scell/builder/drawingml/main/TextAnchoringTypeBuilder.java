package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextAnchoringTypeModel;

public class TextAnchoringTypeBuilder {
  private TextAnchoringTypeModel value;

  public TextAnchoringTypeBuilder() {
    this.value = null;
  }

  public TextAnchoringTypeBuilder from(TextAnchoringTypeModel value) {
    this.value = value;
    return this;
  }

  public TextAnchoringTypeModel build() {
    return this.value;
  }

  public TextAnchoringTypeBuilder setValue(TextAnchoringTypeModel value) {
    this.value = value;
    return this;
  }
}
