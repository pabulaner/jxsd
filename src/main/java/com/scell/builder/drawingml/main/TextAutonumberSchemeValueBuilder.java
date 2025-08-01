package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextAutonumberSchemeValueModel;

public class TextAutonumberSchemeValueBuilder {
  private TextAutonumberSchemeValueModel value;

  public TextAutonumberSchemeValueBuilder() {
    this.value = null;
  }

  public TextAutonumberSchemeValueBuilder from(TextAutonumberSchemeValueModel value) {
    this.value = value;
    return this;
  }

  public TextAutonumberSchemeValueModel build() {
    return this.value;
  }

  public TextAutonumberSchemeValueBuilder setValue(TextAutonumberSchemeValueModel value) {
    this.value = value;
    return this;
  }
}
