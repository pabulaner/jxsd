package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_TextAutonumberSchemeModel;

public class ST_TextAutonumberSchemeBuilder {
  private ST_TextAutonumberSchemeModel value;

  public ST_TextAutonumberSchemeBuilder() {
    this.value = null;
  }

  public ST_TextAutonumberSchemeBuilder from(ST_TextAutonumberSchemeModel value) {
    this.value = value;
    return this;
  }

  public ST_TextAutonumberSchemeModel build() {
    return this.value;
  }

  public ST_TextAutonumberSchemeBuilder setValue(ST_TextAutonumberSchemeModel value) {
    this.value = value;
    return this;
  }
}
