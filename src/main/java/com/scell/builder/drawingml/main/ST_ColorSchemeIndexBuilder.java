package com.scell.builder.drawingml.main;

import com.scell.model.drawingml.main.ST_ColorSchemeIndexModel;

public class ST_ColorSchemeIndexBuilder {
  private ST_ColorSchemeIndexModel value;

  public ST_ColorSchemeIndexBuilder() {
    this.value = null;
  }

  public ST_ColorSchemeIndexBuilder from(ST_ColorSchemeIndexModel value) {
    this.value = value;
    return this;
  }

  public ST_ColorSchemeIndexModel build() {
    return this.value;
  }

  public ST_ColorSchemeIndexBuilder setValue(ST_ColorSchemeIndexModel value) {
    this.value = value;
    return this;
  }
}
