package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.TextAutonumberSchemeModel;

public class TextAutonumberSchemeBuilder {
  private TextAutonumberSchemeModel value;

  public TextAutonumberSchemeBuilder() {
    this.value = null;
  }

  public TextAutonumberSchemeBuilder from(TextAutonumberSchemeModel value) {
    this.value = value;
    return this;
  }

  public TextAutonumberSchemeModel build() {
    return this.value;
  }

  public TextAutonumberSchemeBuilder setValue(TextAutonumberSchemeModel value) {
    this.value = value;
    return this;
  }
}
